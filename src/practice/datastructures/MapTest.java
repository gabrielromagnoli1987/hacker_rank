package practice.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i=0; i<n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            // this solution worked but didn't pass some tests because of time performance
//            Integer number = phoneBook.get(s);
//            if (number != null)
//                System.out.printf("%s=%d\n", s, number);
//            else
//                System.out.printf("Not found\n");
            // this other solution os more performant
            if (! phoneBook.containsKey(s)) {
                System.out.println("Not found");
            } else
                System.out.printf("%s=%d\n", s, phoneBook.get(s));
        }
    }
}
