import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Rekursive Berechnung:");
        for (int i = 0; i <= n; i++) {
            System.out.println(rfib(i));
        }
    }
    public static long rfib (int n) {
        if (n < 2) {
            return n;
        }
        return rfib(n-1) + rfib(n-2);
    }
}
