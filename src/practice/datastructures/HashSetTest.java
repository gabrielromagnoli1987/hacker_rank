package practice.datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i].concat(" ").concat(pair_right[i]);
            set.add(pair);
            System.out.println(set.size());
        }

    }
}