public class TriangularNumberSequence {
    public static void main(String[] args) {
        System.out.println(triangle(6));
    }

    public static int triangle(int n) {
        int num = 1;
        for (int i = 1; i < n; i++) {
            num *= i;
        }



        return num;
    }
}
