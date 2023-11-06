package Uebung02;

public class Quersumme {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        if (n < 10) {
            System.out.println("Bitte eine zweistellige Zahl eingeben");
            return;
        } else
            while (n != 0) {
                sum += n%10;
                n = n / 10;
            }
        System.out.println(sum);

    }
}
