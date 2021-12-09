public class MyArray{

    public static void main(String[] args) {
        double[] arrayX = {1.5, 1.4, 1.3, 1.2};
        double[] arrayY = {22.1, 1.6, 1.55, 1.45, 1.1};
        double[] mergedArray = merge(arrayX, arrayY);

        for (double num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    
    /**
	 * Führt zwei absteigend sortierte Eingabearrays von double-Werten zu einem absteigend sortierten Array zusammen und gibt diesen zurück.
	 * 
	 * @param arrayX Der erste Eingabearray mit double Werten
	 * @param arrayY Der zweite Eingabearray mit double Werten
	 * @return Den Ergebnisarray, der alle double-Werte aus arrayX und arrayY, in absteigender Reihenfolge sortiert, enthält.
	 */
    public static double[] merge(double[] arrayX, double[] arrayY) {
        double[] mergedArray = new double[arrayX.length + arrayY.length];
        for (int i = 0; i < arrayX.length; i++) {
            mergedArray[i] = arrayX[i];
        }
        int j = 0;
        for (int i = arrayX.length; j < arrayY.length; i++) {
            mergedArray[i] = arrayY[j];
            j++;
        }
        for (int i = 1; i < mergedArray.length; i ++) {
            double num = mergedArray[i];
            int k = i -1;
            while (k>= 0 && mergedArray[k] < num) {
                mergedArray[k + 1] = mergedArray[k];
                k--;
            }
            mergedArray[k + 1] = num;
        }
        double[] Ergebnisarray = mergedArray;
        return Ergebnisarray;
    }

}