public class TuermeVonHanoi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean left = true;
        moves(n, left);
    }
    public static void moves (int n, boolean left) {
        boolean right  =!left; // entgegengesetzte Richtung
        if (n == 0) return; // Basisfall
        moves(n-1, right);
        if (left) System.out.println(n + " links");
        else System.out.println(n + " rechts");
        moves(n-1, right);
    }
}
