public class MyArray4 {
    public static void main(String[] args) {
        int[][] inputArray = {{1,2,5,8}, {11,5,7,10}, {111, 110, -5}};
        String index = findIndex(inputArray, 110);
        System.out.println(index);
    }

     /**
	 * Die Methode liefert den Index des zweidimensionalen Arrays, an dem inputValue steht.
	 * Im zweidimensionalen Array (Eingabe) kommt kein Wert doppelt vor.
	 * Wir der gesuchte Wert im zweidimensionalen Array nicht gefunden, so liefert die Methode einen leeren String.
	 * 
	 * @param inputArray Der zweidimensionale Array (Eingabe)
	 * @param inputValue Der Wert nach dem gesucht wird
	 * @return der Index an dem der gesuchte Wert steht (falls existent), ein leerer String andernfalls. 
	 */

     static String findIndex(int[][] inputArray, int inputValue) {
         double i = 0;
         for(int[] inneerArray : inputArray) {
             double j = 0.0;
             for(int value : inneerArray) {
                 if (inputValue == value) {
                     return Double.toString(i+j);
                 }
                 j+=0.1;
             }
             i++;
         }
         return "";
     }
}
