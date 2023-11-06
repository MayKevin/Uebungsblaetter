public class Test {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Punkt[] a = new Punkt[n];
        for (int i = 0; i < n; i++) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
        }
    }
}
class Punkt {
    static int count = 0;
    private double x, y;
    public Punkt (double x, double y) {
        count++;
        this.x = x;
        this.y = y;
    }
    public static int anzahl() {

        return count;
    }
    public double getX() {
        return this.x;
    }
    public boolean equals (Punkt other) {
        return this.x == other.x && this.y == other.y;
    }
}