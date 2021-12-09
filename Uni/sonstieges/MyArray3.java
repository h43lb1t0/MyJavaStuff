public class MyArray3 {
    public static void main(String[] args) {
        int[] Ergebnise = createNumbers(7);
        for (int Ergebnis : Ergebnise) {
            System.out.println(Ergebnis);
        }
    }

    /**
	 * Die Methode kreiert für einen Eingabewert inputValue einen Array gemäß folgender Regeln:
	 * Der Array hat die Länge inputValue.
	 * An Indexstelle 0 steht der Wert 1.
	 * An Indexstelle 1 steht der Wert 1.
	 * An Indexstelle i steht die Summe gebildet aus den Werten an Indexstelle i-1 und i-2.
	 * Eingabewerte < 2 brauchen Sie nicht zu betrachten.
	 * 
	 * @param inputValue Der Eingabewert, der die Größe des Arrays bestimmt.
	 * @return Der Ergebnisarray
	 */

     static int[] createNumbers(int n) {
         int[] Ergebnisarray = new int[n];
         Ergebnisarray[0] = 1;
         Ergebnisarray[1] = 1;

         for(int i = 2; i < n; i++) {
            Ergebnisarray[i] = ((Ergebnisarray[i-1]) + (Ergebnisarray[i-2]));
         }
         return Ergebnisarray;
     }
}
