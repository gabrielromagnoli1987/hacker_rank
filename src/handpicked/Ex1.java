package handpicked;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Result {

    public static int timeToInput(String s, String keypad) {
        int time = 0;

        if (keypad.length() != 9)
            return 0;

        // transforms the keypad string to a 2 dimensional array
        char[][] k = new char[3][3];
        int i = 0;
        for (int j = 0; j < keypad.length(); j++) {
            k[i][j % 3] = keypad.charAt(j);
            if ((j + 1) % 3 == 0)
                i++;
        }

        int previousIndexRow = 0;
        int previousIndexCol = 0;
        boolean found = false;
        boolean isFirstDigit = true;

        for (int w = 0; w < s.length(); w++) {
            for (int x = 0; x < k.length; x++) {
                for (int y = 0; y < k.length; y++) {
                    if (s.charAt(w) == k[x][y]) {
                        found = true;
                        int d = 0;
                        if (! isFirstDigit) {
                            d = calculateDistance(x, y, previousIndexRow, previousIndexCol);
                        } else {
                            isFirstDigit = false;
                        }
                        previousIndexRow = x;
                        previousIndexCol = y;
                        time += d;
                        break;
                    }
                }
                if (found)
                    break;
            }
            found = false;
        }

        return time;
    }

    private static int calculateDistance(int actualIndexRow, int actualIndexCol,
                                          int previousIndexRow, int previousIndexCol) {
        int absCol = Math.abs(actualIndexCol - previousIndexCol);
        int absRow = Math.abs(actualIndexRow - previousIndexRow);
        int d = absCol + absRow;
        if (d > 2)
            d = 2;
        return d;
    }

}
public class Ex1 {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String keypad = bufferedReader.readLine();

        int result = Result.timeToInput(s, keypad);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
/*

423692
923857614

 */