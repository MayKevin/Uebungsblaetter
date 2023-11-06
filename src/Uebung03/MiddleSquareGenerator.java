package Uebung03;
import java.util.Scanner;

public class MiddleSquareGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a < 10 || a > 99) {
            System.out.println("Bitte gib nur ganze postive Zahlen bis 99 ein!!");
            a = scanner.nextInt();

        } if (a < 100 || a > 0){
            for (int i = 0; i <= 101;i++) {
                int quad = (int) Math.pow(a,2); //quadrieren
                a = (quad/10) % 100; //aktualisieren
                String b = String.format("%04d", quad);
                System.out.println("Die " + i + ". Zahl ist: " + b); //ausgeben
            }
        }
    }
}
