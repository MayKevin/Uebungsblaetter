package Uebung9u10;

public class Geld {
    public static void main(String[] args) {
        int euro1 = Integer.parseInt(args[0]);
        int cent1 = Integer.parseInt(args[1]);
        Geld betrag1 = new Geld(euro1, cent1);
        int euro2 = Integer.parseInt(args[2]);
        int cent2 = Integer.parseInt(args[3]);
        Geld betrag2 = new Geld(euro2, cent2);
        boolean gleich = betrag1.equals(betrag2);
        System.out.println(gleich);
    }

    public void add(Geld g) {
        
    }

    private int euro, cent;

    private void cent (int e, int c) {
        cent = c;
        euro = e;

        if (cent > 99) {
            euro += cent/100;
            cent %= 100;
        }
    }

    public boolean equals (Geld g) {
        return this.cent == g.cent && this.euro == g.euro;
    }

    //Konstruktor
    public Geld (int e, int c) {
        cent(e,c);
        System.out.println(euro + "," + cent + "$");
    }
}
