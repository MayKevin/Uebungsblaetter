public class Palindrom {
    public static void main(String[] args) {
        String n = args[0];
        String x = n.toLowerCase();
        if (isPalindrom(n)) {
            System.out.println(n + " ist ein Palindrom: ");
            System.out.print("Siehe : " + n + " == ");
            wechsel(n);
        } else {
            System.out.println(n + " ist kein Palindrom");
            System.out.print("Siehe : " + n + " != ");
            wechsel(n);
        }
    }

    public static boolean isPalindrom (String s) {
        int N = s.length();

        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i) != s.charAt(N - i - 1))
                return false;
        }
        return true;
    }
    public static void wechsel (String a) {
        int x = a.length();
        char[] c = a.toCharArray();
        char[] b = a.toCharArray();
        for (int i = 0; i < a.length() / 2; i++) {
            c[i] = b[x - i - 1];
            c[x - i - 1] = b[i];

        }
        System.out.println(c);
    }
}
