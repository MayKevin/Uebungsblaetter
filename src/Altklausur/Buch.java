package Altklausur;

public class Buch {

    private String titel;
    private int seitenzahl;
    private static int anzahl;
    private static int gesamt;

    public Buch (String t) {
        titel = t;
    }
    public Buch (String t, int s) {
        titel = t;
        seitenzahl = s;
    }

    public void setSeitenzahl (int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }

    public int getSeitenzahl () {
        return seitenzahl;
    }

    public static void main(String[] args) {
        Buch b = new Buch("Lielingsbuch");
        b.seitenzahl = 500;

    }
}
