package cw;

/* Write a function that takes a positive integer n, sums all the cubed values from 1 to n (inclusive),
 * and returns that sum.
 * Assume that the input n will always be a positive integer.
 * Example: (Input --> output)
 * 3 --> 36 (sum of the cubes of 1, 2, and 3 is 1 + 8 + 27)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(sumCubes(1));
        System.out.println(sumCubes(2));
        System.out.println(sumCubes(3));
        System.out.println(sumCubes(4));
        System.out.println(sumCubes(10));
        System.out.println(sumCubes(123));
    }

    public static long sumCubes(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (long) Math.pow(i, 3);
        }
        return sum;
    }
}
