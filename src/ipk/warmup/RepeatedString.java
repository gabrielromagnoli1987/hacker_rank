package ipk.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // 1 <= n <= 10^12 (1000000000000)
    // MAX_INT = 2147483648
    // MAX_LONG = 2^63 (9,223372037×10^18)
    // i cannot use s.chatAt(i) if n > MAX_INT

    // https://www.youtube.com/watch?v=1fqNjZ1Gsxs

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int count = 0;
        long repeated = n / s.length(); // cantidad de veces que la misma secuencia puede repetirse dentro de n
        // long rest = Math.floorMod(n, s.length());
        int rest = (int)(n % s.length());
        for(char ch : s.toCharArray()){
            if(ch == 'a')
                count++;
        }
        long total = count * repeated;
        if(rest == 0)
            return total;
        else {
            String part = s.substring(0, rest);
            for(char ch : part.toCharArray()){
                if(ch == 'a')
                    total++;
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
