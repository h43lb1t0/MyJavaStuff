public class MyArray {
    public static void main(String[] args) {
        double[] TheArray = {1.2, 1.3, 1.4, 1.5, 1.6};
        System.out.println(addUp(TheArray));
    }

    /**
	 * Addiert alle Elemente des Arrays auf und gibt die Summe zurück.
	 * 
	 * @param inputArray Der Eingabearray mit double Werten, die aufaddiert werden sollen.
	 * @return Die Summe (double) aller Werte des Eingabearrays
	 */
    static double addUp(double[] TheArray) {
        double sum = 0.0;
        for (double num : TheArray) {
            sum += num;
        }
        return sum;
    }
}
