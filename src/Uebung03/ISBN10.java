package Uebung03;
import java.util.Scanner;


public class ISBN10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = n;
        String s = Integer.toString(n);
        int c = 0;
        int sum = 0;
        int newSum = 0;

        if (n > 999999999) {
            System.out.println("Bitte keine Zahl mit mehr als 9 Stellen eingeben");
            n = scanner.nextInt();
        } else {
            for (int b = s.length(); n != 0; b--) {
                sum += (n % 10) * b;
                n = n / 10;

            }
            System.out.println("gewichtete Quersumme: " + sum);
            c = sum;
            int secSum = 0;

            for (int i = 1; c != 0; i++) {
                secSum += c % 10;
                c = c / 10;

                secSum -= c % 10;
                c = c / 10;
            }
            System.out.println("iterierte Quersumme: " + secSum);

            if (secSum >= 11) {
                for (int x = 0; secSum != 0; x++) {
                    newSum += secSum % 10;
                    secSum = secSum / 10;

                    newSum -= secSum % 10;
                    secSum = secSum / 10;
                }
                System.out.println("neue iterierte Quersumme: " + newSum);

                }
            for (int i = 0; secSum < 0; i++) {
                secSum += 11;
            }
            for (int i = 0; newSum < 0; i++) {
                newSum += 11;
            }

            if (newSum == 10) {
                System.out.println(d + "X");
            } else if (secSum == newSum){
                System.out.println(s + newSum);
            } else {
                System.out.println(s + secSum);
            }
        }
    }
}