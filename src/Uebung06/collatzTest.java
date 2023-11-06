package Uebung06;
import java.util.Scanner;

public class collatzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        collatzIterativ(n);

    }

    static void collatzIterativOutput(int n) {
        int max = (Integer.MAX_VALUE - 1) / 3;
        int[] collatz = {n};
        for (int i = 0; n != 1;) {
            if (i == Integer.MAX_VALUE) break;
            if (n % 2 == 0) {
                n /= 2;
                i++;
            } else {
                n = n*3 + 1;
                i++;
               }
            }
    }
    static int [] collatzIterativ(int n) {
        int max = (Integer.MAX_VALUE - 1) / 3;
        for (int i = 0; n != 1 || i >= Integer.MAX_VALUE;) {
            System.out.println(i + " " + n);
            if (n % 2 == 0) {
                if (n > max) {
                    break;
                }
                n /= 2;
                i++;
                if (n == 1) {
                    System.out.println(i + " " + n);
                }
            } else {
                n = n*3 + 1;
                i++;
            }
            if (n == 1) {
                System.out.println(i + " " + n);
            }
        }
        return new int[0];
    }
    public static int[] appendInt(int[] a, int b) {
        int[] c = new int[a.length + 1];
        for (int i = 0; i < a.length;i++) {
            c[i] = a [i];
        }
        c [a.length] = b;
        return c;
    }
}