package practice.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        scanner.close();
    }

}
