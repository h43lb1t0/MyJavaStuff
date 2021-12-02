public class test {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (i < 5) {
                numbers[i] = i+3;
            }
            else {
                numbers[i] = i-3;
            }
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
