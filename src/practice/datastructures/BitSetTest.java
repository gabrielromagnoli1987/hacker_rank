package practice.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int set = scanner.nextInt();
            int setOrIndex = scanner.nextInt();
            switch (operation) {
                case "AND":
                    if (set == 1)
                        b1.and(b2);
                    else
                        b2.and(b1);
                    break;
                case "OR":
                    if (set == 1)
                        b1.or(b2);
                    else
                        b2.or(b1);
                    break;
                case "XOR":
                    if (set == 1)
                        b1.xor(b2);
                    else
                        b2.xor(b1);
                    break;
                case "FLIP":
                    if (set == 1)
                        b1.flip(setOrIndex);
                    else
                        b2.flip(setOrIndex);
                    break;
                case "SET":
                    if (set == 1)
                        b1.set(setOrIndex);
                    else
                        b2.set(setOrIndex);
                    break;
            }
            System.out.printf("%d %d\n", b1.cardinality(), b2.cardinality());
        }
    }

}
