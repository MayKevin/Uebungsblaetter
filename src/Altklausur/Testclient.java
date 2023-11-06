package Altklausur;

public class Testclient {
    public static void main(String[] args) {
        Wein w1 = new Wein("2001er Morio Muskat");
        Wein w2 = new Wein("Barefoot lieblich", 69.50);
        w1.setPreis(12.99);

        //System.out.println("Wein 1 kostet: " + w1.getPreis());
        //System.out.println("Wein 2 kostet: " + w2.getPreis());
        System.out.println("Gesamtkosten: " + Wein.getAnzahl());
        System.out.println("Gesamt Anzahl an Weinen: " + Wein.getGesamt());
        System.out.println(w1.getPreis());
    }
}
