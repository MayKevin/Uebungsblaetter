package Uebung1;

public class Quadrat {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 1;
        int b = 0;
        if (n == 0) {
            System.out.println("0");
        } else if (n < 0) {
            n = 0 - n;

        }
        for (int i = 0; i < n; i++) {
            b += a;
            a += 2;

        }
        System.out.println(b);

    }
}
