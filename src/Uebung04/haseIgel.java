package Uebung04;
import java.util.Scanner;

public class haseIgel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String hex = Long.toHexString(n);
        System.out.println("0x" + hex);

     }
}
