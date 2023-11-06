package Uebung06;

public class Collatz {
    public static void main(String args[]) {

        // Fehlermeldung bei keiner oder mehr als 2 Zahlen. Ganz wichtig:
        // Dies tun bevor wir anfangen die Zahlen tatsaechlich einzulesen.
        if (args.length < 1 || args.length > 2) {
            System.out.println("Bitte entweder nur einen oder 2 Werte.");
            return;                                                 // Ganz wichtig: Programm im Fehlerfall beenden.
        }

        int n = Integer.parseInt(args[0]);                          // Lies erste Zahl ein.

        if (args.length == 2) { 	                                // Falls 2 Zahlen eingegeben wurden, ...
            int m = Integer.parseInt(args[1]);                          // ...lies die zweite Zahl ein.
            if (n <= 0 || m <= 0 || n > m){                             // Pruefe anschliessend dass beide Zahlen positiv sind und
                System.out.println("Nur positive Zahlen und n <= m.");  // m >= n ist. Falls eines davon nicht zutrifft, Fehlermeldung
                return;                                                 // und Programm beenden.
            }

            for (int i = n; n <= m; i++) {                              // Fuer jede Zahl von n bis einschliesslich m...
                int[] collatz = collatzIterativ(i);                         // ...benutze collatzIterativ(int) um die Collatz-Folge zu ermitteln.
                if (collatz == null) {                                      // collatzIterativ(int) gibt null zurueck genau dann wenn einer der
                    System.out.println("Fuer die Zahl " + i + " kann " +    // Fehlerfaelle eintritt (die Integer.MAX_VALUE-Sachen), was bedeutet,
                            "keine Aussage getroffen werden.");                 // dass fuer die Zahl i keine Aussage hinsichtlich der Collatz-Vermutung
                }                                                           // getroffen werden kannn.
                else{
                    System.out.println("Collatz-Vemutung bestaetigt " +     // Falls collatzIterativ(int) einen Array, also nicht null zurueckgibt,
                            "fuer " + i);                                       // wurde die Collatz-Vermutung bestaetigt.
                }
            }
        }


        if (args.length == 1) {                                     // Falls eine Zahl eingegeben wurde, ... (hier koennte man auch mit else arbeiten)
            if (n <= 0) {                                               // ...pruefe ob die Zahl positive ist, ansonsten Fehlermeldung und Programm
                System.out.println("Nur positve Zahlen.");              // beenden.
                return;
            }

            collatzIterativOutput(n);                                   // Rufe wie in der Aufgabenstellung gefordert collatzIterativOutput auf.
            System.out.println("");                                     // Fuer die Uebersicht noch ein new line.
            int[] res = collatzIterativ(n);                             // Rufe collatzIterativ auf...
            if (res != null) {                                          // Pruefe ob Ergebnis nicht null... (nicht in Aufgabenstellung gefordert, ist
                // aber trotzdem sinnvoll und richtig.)
                for (int i = 0; i < res.length; i++) {                      // ...und wenn nicht null, gib das Ergebnis aus.
                    System.out.println(i + " " + res[i]);                   // Dabei sollen wir jeweils Index und Folgenglied ausgeben.
                }
            }
            else {                                                      // Falls Ergebnis null, entsprechende Meldung.
                System.out.println("Fuer die Zahl " + n + " kann " +
                        "keine Aussage getroffen werden.");
            }
        }

    }



    public static void collatzIterativOutput(int n) {

        // Diese Methode funktioniert sehr aehnlich wie collatzIterativ(int), die Unterschiede haben Kommentart.

        int groessteZahlBeiDerMal3NochGeht = (Integer.MAX_VALUE - 1) / 3;
        int count = 0;

        System.out.println(n);

        while(n != 1 && count < Integer.MAX_VALUE) {        // Hier koennen wir count mit in die Bedingung der while-Schleife schreiben, weil wir in dem Fall
            // nichts spezieller zurueckgeben muesen.

            //if (count == Integer.MAX_VALUE)               // So koennte man es aber auch machen.
            //    return;

            if (n % 2 != 0) {
                if (n > groessteZahlBeiDerMal3NochGeht) {
                    break;                                  // Anstelle von 'return null' hier einfach ein break um die Schleife zu beenden. Da nach der
                }                                           // Schleife nichts mehr passiert, wäre ein 'return' equivalent und ist auch moeglich.

                n = 3 * n + 1;
            }
            else {
                n = n / 2;
            }

            System.out.println(n);                          // Gib naechstes Folgenglied aus anstatt es in einen Array zu packen.

            count++;
        }
    }

    public static int[] collatzIterativ(int n) {
        int groessteZahlBeiDerMal3NochGeht = (Integer.MAX_VALUE - 1) / 3;
        int count = 0;

        int[] collatz = { n };                              // Erstelle Array mit erstem Folgenglied
        //int[] collatz = new int[1];   // So kann man es auch machen
        //collatz[0] = n;

        while(n != 1) {                                         // Solange letztes Folgenglied nicht 1 ist...
            // (Das ist equivalent mit 'bis das letzte Folgenglied 1 ist')

            if (count == Integer.MAX_VALUE) {                       // Falls wir Integer.MAX_VALUE viele Folgenglieder berechnet haben und noch nicht
                // fertig sind, gib null zurueck um zu vermitteln, dass keine Aussage hinsichtlich der
                return null;                                        // Collatz-Vermutung getroffen werden kann.
            }

            if (n % 2 != 0) {                                       // Falls n ungerade
                if (n > groessteZahlBeiDerMal3NochGeht) {               // Pruefe ob n so gross ist, dass wenn man n * 3 + 1 rechnen wuerde, das Ergebnis
                    // groesser als Integer.MAX_VALUE werden wuerde. Dann wuerde es zu einem Ueberlauf
                    // kommen.
                    return null;                                        // Falls dies der Fall ist, gib null zurueck um zu vermitteln, dass keine Aussage
                    // hinsichtlich der Collatz-Vermutung getroffen werden kann.
                }

                n = 3 * n + 1;                                          // Berechne naechstes Folgenglied.
            }
            else {                                                  // Falls n gerade
                n = n / 2;                                              // Berechne naechstes Folgenglied.
            }

            collatz = appendInt(collatz, n);                        // Fuege neues Folgenglied an Array an mithilfe von appendInt.

            count++;                                                // Erhoehe die Zaehlvariable.
        }

        return collatz;                                             // Gib Ergebnis zurueck.
    }


    public static int[] appendInt(int[] a, int b) {
        int[] f = new int[a.length + 1];            // Erstelle neuen Array der um 1 laenger ist als a.
        for (int i = 0; i < a.length; i++) {        // Kopiere alte Werte von a nach f.
            f[i] = a[i];
        }

        f[a.length] = b;                            // Setze neuen letzen Wert von f auf b.
        //f[f.length - 1] = b;  // So kann man es auch machen.

        return f;
    }
}