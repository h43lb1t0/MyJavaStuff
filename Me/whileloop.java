import java.util.Scanner;
public class whileloop {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        scanner.close();
        System.out.println("your name is: " + name);
    }
}
