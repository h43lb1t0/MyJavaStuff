import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Text to reverse: ");
        String a = in.nextLine();
        in.close();
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        System.out.println("original: " + a);
        System.out.println("Reverset: " + b);
    }
}