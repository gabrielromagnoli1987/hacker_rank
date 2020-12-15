package practice.datastructures;

import java.util.*;

public class DequeueTest {
    // https://www.hackerrank.com/challenges/java-dequeue/problem
    // 7 of 10 test cases, use map instead of set
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Deque<Integer> deque = new ArrayDeque<>();
//        int n = in.nextInt();
//        int m = in.nextInt();
//        Set<Integer> set = new HashSet<>();
//        int max = -1;
//        for (int i = 0; i < n; i++) {
//            int num = in.nextInt();
//            deque.add(num);
//            set.add(num);
//            if ((i + 1) % m == 0) {
//                if (set.size() > max)
//                    max = set.size();
//                Integer oldest = deque.remove();
//                set.remove(oldest);
//            }
//        }
//        System.out.println(max);
//    }
    // The solution from the community
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = map.size();

        for (int i = 0; i < n; i++) {
            /* Remove old value (if necessary) */
            if (i >= m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }
            /* Add new value */
            int num = scan.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());

            /* If all integers are unique, break out of loop */
            if (max == m) {
                break;
            }
        }
        scan.close();
        System.out.println(max);
    }

}
