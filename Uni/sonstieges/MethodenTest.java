import java.util.Scanner; // Import der notwendigen Scanner-Klasse für Eingaben

/**
* Klasse MethodenTest.
* 
* Diese Klasse berechnet das Ergebnis zweier Eingabewerte über drei verschachtelte Methoden
*  
* @author Ihr Name
* @version 0.0
*/
public class MethodenTest {

	/**
	* main-Methode
	* Sie liest zwei Eingabewerte von der Konsole und gibt das Ergebnis auf der Konsole aus
	* Diese Klasse berechnet das Ergebnis zweier Eingabewerte über drei verschachtelte Methoden
	*  
	* @param args String-Array für mögliche Startparameter
	*/
	public static void main(String[] args) {
	    
		// Inhalt der Main-Methode nicht ändern!!!
		
		// Eingabe von zwei Werten:
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte erste Zahl eingeben: ");
		int eingabe1 = scanner.nextInt();
		System.out.print("Bitte zweite Zahl eingeben: ");
		int eingabe2 = scanner.nextInt();
		scanner.close();

		// Aufruf zur Berechnung
		int ergebnis = new MethodenTest().methode1(eingabe1,eingabe2);
		
		// Ausgabe des Ergebnis
		System.out.println(ergebnis);

	}
	
	/**
	* methode1
	* Diese Methode addiert den ersten Eingabeparameter mit sich selbst und reicht
	* das Ergebnis als ersten Aufrufparameter an methode2 weiter. Der zweite Eingabeparameter
	* wird als zweiter Aufrufparameter an methode2 durchgereicht.
	* Das Ergebnis der methode2 wird zurückgegeben.
	*  
	* @param wert1 Integer als erster Eingabeparameter
	* @param wert2 Integer als zweiter Eingabeparameter
	* @return Integer als Rückgabewert
	*/
	
	public int methode1(int a, int b) {
        a += a;
        return new MethodenTest().methode2(a, b);
    }
	
	/**
	* methode2
	* Diese Methode multipliziert den zweiten Eingabeparameter mit sich selbst und reicht
	* das Ergebnis als zweiten Aufrufparameter an methode3 weiter. Der erster Eingabeparameter
	* wird als erster Aufrufparameter an methode3 durchgereicht.
	* Das Ergebnis der methode3 wird zurückgegeben.
	*  
	* @param wert1 Integer als erster Eingabeparameter
	* @param wert2 Integer als zweiter Eingabeparameter
	* @return Integer als Rückgabewert
	*/

	public int methode2(int a, int b) {
        b *= b;
        return new MethodenTest().methode3(a, b);
    }
	
	/**
	* methode3
	* Diese Methode addiert beider Eingabeparameter und gibt das Ergebnis zurück.
	*  
	* @param wert1 Integer als erster Eingabeparameter
	* @param wert2 Integer als zweiter Eingabeparameter
	* @return Integer als Rückgabewert
	*/
	
	public int methode3(int a, int b) {
        return a+b;
    }
	
}