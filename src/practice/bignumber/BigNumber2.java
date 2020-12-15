package practice.bignumber;

import java.math.BigDecimal;
import java.util.*;

class BigNumber2 {
    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for (int i=0; i<n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        // My solution didn't keep the format of the output
//        BigDecimal[] numbers = new BigDecimal[n];
//        for (int i=0; i<n; i++) {
//            numbers[i] = new BigDecimal(s[i]);
//        }
//        Arrays.sort(numbers, Comparator.reverseOrder());
//        for (int i=0; i<n; i++) {
//            s[i] = numbers[i].toString();
//        }

        //Write your code here
        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                //convert to big decimal inside comparator
                //so permanent string values are never changed
                //aka you only use the BigDecimal values to
                //compare the practice.strings!
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));

        // Output
        for (int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
    }
}