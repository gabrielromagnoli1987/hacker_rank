package practice.loops;

import java.util.Scanner;

class LoopsTwo {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0; i<t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] seq = generateSequence(a, b, n);
            // System.out.println(Arrays.toString(seq).replaceAll("\\[|\\]|,|\\s| ", " "));
        }
        in.close();
    }

    private static int[] generateSequence(int a, int b, int n) {
        int s[] = new int[n];
        int r = a;
        for (int j=0; j<n; j++) {
            r = (int) (Math.pow(2, j) * b);
            s[j] = r;
        }
        return s;
    }
}