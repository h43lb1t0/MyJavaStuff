public class Abgabe32 {
    public static void main(String[] args) {
        int ergebnis = new Abgabe32().powerOfTwo(2);
        System.out.println(ergebnis);
    }

    public int powerOfTwo(double n) {
        if (n < 0) {
            return -1;
        }
        else {
            int ergebnis = (int)Math.pow(2, n);
            return ergebnis;
        }
    }
}
