public class Intervallsumme {
    public static void main(String[] args) {

        int[] p = { 1, 4, 0, 3, 6, 2, 7, 5 };
        int[] c = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] q = { 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 8; i++) {
            c[p[i]] = c[p[i]] + 1;
            System.out.print(c[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            q[p[i]] = i;
            System.out.print(q[i] + " ");
        }

    }
    }
