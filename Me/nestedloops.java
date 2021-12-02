import java.util.Scanner;
public class nestedloops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, columns;
        String symbol = "";

        System.out.print("Enter # of rows ");
        row = scanner.nextInt();

        System.out.print("Enter # of columns ");
        columns = scanner.nextInt();

        System.out.print("Enter Symbol ");
        symbol = scanner.next();
        scanner.close();


        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(i);
            }
        }
    }
}
