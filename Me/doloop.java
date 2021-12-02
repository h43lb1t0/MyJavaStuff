import java.util.Scanner;
public class doloop {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        scanner.close();
        System.out.println("your name is: " + name);
    }
}

