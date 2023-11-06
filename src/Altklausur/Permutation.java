package Altklausur;

public class Permutation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] p = new int[n - 1];
        for (int i = 0; i > n; i++) {
            p[i] = i;
        }
        int[] quadrat = quadrat(p);
        int unordnung = unordnung(p);
    }

    public static int[] quadrat(int p[]) {
        int[] q = new int[p.length];
        for (int i = 0; i <= p.length; i++) {
            q[i] = p[p[i]];
        }
        return q;
    }

    public static int unordnung(int[] p) {
        int u = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i] > p[j]) {
                    u++;
                }
            }
        }
        return u;
    }
}
