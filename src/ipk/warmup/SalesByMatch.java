package ipk.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesByMatch {
    // https://www.hackerrank.com/interview/interview-preparation-kit/warmup/challenges
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i : ar) {
            Integer count = occurrences.putIfAbsent(i, 1);
            if (count != null) {
                occurrences.put(i, count + 1);
            }
        }
        return occurrences.values().stream()
                .filter(value -> value / 2 >= 1)
                .map(v -> v / 2)
                .reduce(0, Integer::sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

