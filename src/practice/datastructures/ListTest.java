package practice.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i<q; i++) {
            String instruction = scanner.next();
            if ("Insert".equals(instruction)) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if ("Delete".equals(instruction)) {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

}
