package practice.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String answer = "Yes";
        int i = 0;
        int j = A.length()-1;
        char[] chars = A.toCharArray();
        while (i<j) {
            if (chars[i] != chars[j]) {
                answer = "No";
                break;
            }
            i++;
            j--;
        }
        sc.close();
        System.out.println(answer);
    }
}
