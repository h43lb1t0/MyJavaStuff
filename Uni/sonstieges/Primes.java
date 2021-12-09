public class Primes {
    public static void main(String[] args) {
        boolean primeNumber = new Primes().isPrime(11);
        System.out.println(primeNumber);
    }
    /**
	 * Die Methode überprüft, ob es sich beim Eingabewert um eine Primzahl handelt.
	 * Es werden nur positive Integer-Werte als mögliche Eingabewerte betrachtet.
	 * 
	 * @param input Die Zahl, die überprüft werden soll
	 * @return true wenn es sich um eine Primzahl handelt, false ansonsten
	 */

    boolean prime = false;
    public boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        else {
            for (int i = 2; i <= a/2; ++i ) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
