package practice.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of lines
        List<List<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<>();
            int d = in.nextInt(); // cant of numbers
            line.add(d);
            for (int j = 0; j < d; j++) {
                line.add(in.nextInt());
            }
            lines.add(i, line);
        }
        int q = in.nextInt(); // number of queries
        for (int i = 0; i < q; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt();
            try {
                System.out.println(lines.get(x).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }

}
