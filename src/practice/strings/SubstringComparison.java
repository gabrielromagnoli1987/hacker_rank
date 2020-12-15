package practice.strings;

import java.util.*;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

//        List<String> list = new ArrayList<>();
//        int i = 0;
//        while (i < s.length() && i+k <= s.length()) {
//            list.add(s.substring(i, i+k));
//            i++;
//        }
//        list.sort(String::compareTo);
//        smallest = list.get(0);
//        largest = list.get(list.size()-1);

        SortedSet<String> sets = new TreeSet<>();
        for(int i=0; i<=s.length()-k; i++){
            sets.add(s.substring(i, i+k));
        }
        smallest = sets.first();
        largest = sets.last();

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
