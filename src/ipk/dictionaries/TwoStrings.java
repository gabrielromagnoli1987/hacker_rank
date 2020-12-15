package ipk.dictionaries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        if (s1.length() >= s2.length()) {
            int n = s2.length();
            for (int i = 0; i < n; i++) {
                addChar(s1Map, s1.charAt(i));
                addChar(s2Map, s2.charAt(i));
            }
            for (int i = n; i < s1.length(); i++) {
                addChar(s1Map, s1.charAt(i));
            }
        } else {
            int n = s1.length();
            for (int i = 0; i < n; i++) {
                addChar(s1Map, s1.charAt(i));
                addChar(s2Map, s2.charAt(i));
            }
            for (int i = n; i < s2.length(); i++) {
                addChar(s2Map, s2.charAt(i));
            }
        }
        if (s1Map.size() < s2Map.size()) {
            for(Character c : s1Map.keySet()) {
                if (s2Map.containsKey(c))
                    return "YES";
            }
        } else {
            for(Character c : s2Map.keySet()) {
                if (s1Map.containsKey(c))
                    return "YES";
            }
        }
        return "NO";
    }

    private static void addChar(Map<Character, Integer> map, char c) {
        Integer count = map.putIfAbsent(c, 1);
        if (count != null) {
            map.put(c, count + 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
