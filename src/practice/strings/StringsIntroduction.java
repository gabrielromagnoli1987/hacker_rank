package practice.strings;

import java.util.Scanner;

public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String aCap= A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String bCap= B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(aCap + " " + bCap);

    }

}
