package Uebung02;

public class IterierteQuersumme {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 10) {
            System.out.println("Bitte eine zweistellige Zahl eingeben");
            return;
        } else {
            int ergebnis = querSum(n);
            if (ergebnis > 10) {
                ergebnis = querSum(ergebnis);
            }
            System.out.println(ergebnis);
        }
    }
    public static int querSum (int n) {
        int sum = 0;
        while (n != 0) {
            sum += n%10;
            n = n / 10;
        }
        return sum;
    }
}
