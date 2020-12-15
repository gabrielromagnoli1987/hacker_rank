package practice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    static Map<Character, Integer> buildFrequency(String s) {
        char[] aChars = s.toLowerCase().toCharArray();
        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i<s.length(); i++) {
            char c = aChars[i];
            int count = frequency.getOrDefault(c, 0);
            frequency.put(c, count + 1);
        }
        return frequency;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character, Integer> af = buildFrequency(a);
        Map<Character, Integer> bf = buildFrequency(b);
        return af.equals(bf);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
