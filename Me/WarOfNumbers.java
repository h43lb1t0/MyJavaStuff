public class WarOfNumbers {
    public static void main(String[] args) {
        int[] thearray = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int difference = theWarOfNumbers(thearray);
        System.out.println(difference);
    }

    static int theWarOfNumbers(int[] numbers){
        int odd = 0;
        int even = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        return Math.max(odd, even) - Math.min(odd, even);
    }
}
