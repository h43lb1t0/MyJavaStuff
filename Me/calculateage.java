import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
public class calculateage {
    public static void main(String[] args) {
        System.out.print("Enter your birthdate as dd-mm-yyyy | ");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        in.close();

        LocalDate today = LocalDate.now();
        String[] dateList = date.split("-");
        LocalDate birthday = LocalDate.of(Integer.parseInt(dateList[2]), Integer.parseInt(dateList[1]), Integer.parseInt(dateList[0]));
        
        System.out.println("You are " + Period.between(birthday, today).getYears() + " years old"); 

    }
}