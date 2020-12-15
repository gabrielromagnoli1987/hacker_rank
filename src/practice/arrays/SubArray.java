package practice.arrays;

import java.util.Scanner;

public class SubArray {
    // https://www.hackerrank.com/challenges/java-negative-subarray/problem

    private static int negativeSubarrays(int [] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        System.out.println(negativeSubarrays(a));
    }
}
