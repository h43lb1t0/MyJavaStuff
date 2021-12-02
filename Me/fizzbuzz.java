public class fizzbuzz {
    public static void main(String[] args) {
        option1();
       //option2();
    }

    static void option1() {
        System.out.println("Option 1\n\n");
        for (int i = 1; i <= 5000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz!");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    static void option2() {
        System.out.println("\n\nOption 2\n\n");
        for (int i = 1; i <= 50; i++) {
            String output = "";

            if (i % 3 == 0) {output += "Fizz"; }
            if (i % 5 == 0) {output += "Buzz"; }

            if (output.isEmpty()) {output += Integer.toString(i); }

            System.out.println(output);
        }
    }
}
