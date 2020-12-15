package ipk.arrays;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int glass = 0;
        int maxGlass = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                glass = getOneHourGlass(arr, i, j);
                if (glass > maxGlass)
                    maxGlass = glass;
            }
        }
        return maxGlass;
    }

    private static int getOneHourGlass(int[][] arr, int i, int j) {
        if (i > arr.length - 3 || j > arr.length - 3) {
            return 0;
        }
        int sum = 0;
        sum += arr[i][j];
        sum += arr[i][j+1];
        sum += arr[i][j+2];
        sum += arr[i+1][j+1];
        sum += arr[i+2][j];
        sum += arr[i+2][j+1];
        sum += arr[i+2][j+2];
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
