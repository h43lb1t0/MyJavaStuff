public class MyArray2 {
    public static void main(String[] args) {
        boolean[] inputArray = {true, false, false, false, false, true};
        int[] count = countBooleans(inputArray);
        System.out.println("true: " + count[0] + " false: " + count[1]);
    }
    /**
	 * countBooleans zählt die Anzahl der Vorkommen von true und false im Eingabearray.
	 * Arrays der Größe 0 werden nicht betrachtet,
	 * 
	 * @param inputArray Der Eingabearray bestehend aus booleschen Werte.
	 * @return Der Ergebnisarray der Länge 2. An Indexstelle 0 steht die Anzahl der true-Vorkommen. An Indexstelle 1 steht die Anzahl der false-Vorkommen.
	 */

    static int[] countBooleans(boolean[] inputArray) {
        int countTrue = 0;
        for (boolean bool : inputArray) {
            if (bool) {
                countTrue++;
            }
        }
        int[] Ergebnisarray = {countTrue, inputArray.length - countTrue};
        return Ergebnisarray;
    }
}
