import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        signum(n);
    }
        public static int signum (int n) {
            if (n > 0)
                return +1;
            if ( n < 0)
                return -1;
            return 0;
        }
    }