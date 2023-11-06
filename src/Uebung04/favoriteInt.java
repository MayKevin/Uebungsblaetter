package Uebung04;
import java.util.Scanner;

public class favoriteInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        int i;
        for (i = 1; i < 1001 && i > 0; i++) {
            if (i % 6 == 0) {
                if (i % 7 == 0) {
                    if (i % 4 != 0) {
                        n = i;

                        while (n != 0) {
                            sum += n % 10;
                            n = n / 10;
                        }
                        if (sum == 6) {
                            break;

                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}
