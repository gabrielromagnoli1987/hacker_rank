package practice.files;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer lineNumber = 0;
        while(scanner.hasNext()) {
            lineNumber++;
            String line = scanner.nextLine();
            System.out.printf("%d %s\n", lineNumber, line);
        }
        scanner.close();
    }
}
