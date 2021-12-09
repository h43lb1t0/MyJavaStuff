import java.util.Arrays;

public class BTables {

    public static void main(String[] args) {
        boolean bool = new BTables().evaluateBs(false, false, true);
        System.out.println(bool);
    }
    
    /**
	 * Die gibt den Wahrheitswert gemäß der vorgegeben Wahrheitstabelle (siehe Beschreibung) zurück.
	 * 
	 * @param x1 Boolescher Wert
	 * @param x2 Boolescher Wert
	 * @param x3 Boolescher Wert
	 * @return Das Ergebnis gemäß Wahrheitstabelle
	 */

     public boolean evaluateBs(boolean x1, boolean x2, boolean x3) {
         boolean[] input = new boolean[]{x1, x2, x3};
         boolean[] case1 = new boolean[]{false, true, true};
         boolean[] case2 = new boolean[]{true, false, false};
         boolean[] case3 = new boolean[]{true, false, true};
         if (Arrays.equals(input, case1) || Arrays.equals(input, case2) || Arrays.equals(input, case3)){
             return true;
         }
         else {
             return false;
         }
     }
}