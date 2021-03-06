package practice.advanced;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    // Write your code here
    public static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }
    public static PerformOperation isPrime() {
        return a -> {
            BigInteger number = new BigInteger(String.valueOf(a));
            return number.isProbablePrime(8);
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            String s = String.valueOf(a);
            int i = 0;
            int j = s.length()-1;
            char[] chars = s.toCharArray();
            while (i<j) {
                if (chars[i] != chars[j]) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
    }
}



public class Lambdas {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
