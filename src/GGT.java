import java.util.Scanner;
public class GGT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = euklidModern(a, b);
        System.out.println(d);
    }
    public static int euklidModern (int x, int y) {
        int r;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
