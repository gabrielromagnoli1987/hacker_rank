package practice.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            /* Print the encoded value in hexadecimal */
            for (byte b : digest) {
                System.out.format("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
