package practice.strings;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
//        Pattern pattern = Pattern.compile("[A-Za-z !,?._'@]+");
//        Matcher matcher = pattern.matcher(s);
//        matcher.matches();
//        String[] tokens = s.split(pattern.toString());

        // https://www.thepoorcoder.com/hackerrank-java-string-tokens-solution/
        // String[] tokens = s.split("[A-Za-z !,?._'@]+"); for some reason this regex doesn't match
        String[] tokens = s.split("['!?,._@ ]+");
        System.out.println(tokens.length);
        for(String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}
