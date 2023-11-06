package Altklausur;

public class Wein {
    private double preis;
    private String sorte;
    private static int anzahl = 0;
    private static double gesamt = 0;

    public Wein (String s) {
        sorte = s;
        anzahl++;
    }
    public Wein (String s, double p) {
        sorte = s;
        preis = p;
        anzahl++;
        gesamt += this.preis;
    }

    public double getPreis () {
        return preis;
    }
    public static int getAnzahl() {
        return anzahl;
    }
    public static double getGesamt () {
        return gesamt;
    }

    public void setPreis(double preis) {
        gesamt -= this.preis;
        this.preis = preis;
        gesamt += this.preis;
    }

}
