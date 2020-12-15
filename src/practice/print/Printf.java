package practice.print;
import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i<3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
//            int l = s1.length();
//            if (l < 15) {
//                int whiteSpaces = 15 - l;
//                for(int j = 0; j < whiteSpaces; j++) {
//                    s1 = s1.concat(" ");
//                }
//            }
//            String x1 = "";
//            if (x > 100) {
//                x1 = String.valueOf(x);
//            }
//            if (x < 10) {
//                x1 = String.format("%02d", x);
//            }
//            if (x >= 10 && x < 100) {
//                x1 = String.format("%01d", x);
//            }
//            System.out.printf("%s%s \n", s1, x1);
        }
        System.out.println("================================");

    }
}



