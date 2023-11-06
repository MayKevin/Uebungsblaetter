import java.time.chrono.MinguoEra;

public class Auto {
    private String typ;
    private double preis;
    private static int anzahl;
    private static double gesamt;

    public Auto(String t) {
        typ = t;
        anzahl++;
    }
    public Auto(String t, double p) {
        typ = t;
        preis = p;
        anzahl++;
        gesamt += this.preis;
    }
    public static double getGesamt() {
        return gesamt;
    }

    public void setPreis (double preis) {
        gesamt -= this.preis;
        this.preis = preis;
        gesamt += this.preis;
    }


    public int getAnzahl() {
        return anzahl;
    }

    public static void main(String[] args) {
        Auto Auto1 = new Auto("Mercedes", 3000);
        Auto Auto2 = new Auto("Audi");
        Auto2.setPreis(3500);
        System.out.println("Auto 1, Typ: " + Auto1.typ + " Preis: " + Auto1.preis);
        System.out.println("Gesamtanzahl an Autos: " + anzahl);
        System.out.println("Gesamtpreis der Autos: " + gesamt);
    }
}
