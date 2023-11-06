public class NewPalindrom {
    public static void main(String[] args) {
        final String n = args[0];
        final String x = n.toLowerCase();
        if (wort(x))
            System.out.println("Das Wort " + n + " ist ein Palindrom");
        else {
            System.out.println("Das Wort " + n + " ist kein Palindrom");
            System.out.print("Siehe: " + n + " != ");
            ruekwearts(n);
        }
    }
    public static boolean wort (String a) {
        int n = a.length();

        for (int i = 0; i < n/2;i++) {
            if (a.charAt(i) != a.charAt(n - i - 1))
                return false;
        }
        return true;
    }
    public static String ruekwearts(String a) {
        int n = a.length();
        char[] b = a.toCharArray();
        char[] c = a.toCharArray();
        for (int i = 0; i < n/2; i++) {
            b[i] = c[n - 1 - i];
            b[n - 1 - i] = c[i];
        }
        return a;
    }
}
