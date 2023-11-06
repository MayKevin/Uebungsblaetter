package Altklausur;

class LokaleVariablen {
    public static void d1(int n) {
        n = n + n;
    }
    public static void d2(int[] f, int n) {
        f[n] = f[n] * f[n];
    }
    public static void main(String[] args) {
        int n = 2;
        int[] f = { n, n, n};
        for (int i = 0; i < 3; i++) {
            d1(n);
            d2(f,n);
            System.out.println(f[n]);
        }
        System.out.println(n);
        System.out.println(f[n]);
    }
}