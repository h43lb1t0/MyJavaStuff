import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature to convert and the goel unit like \n\"temperatureC to F\" \n C = Celsius, F = Fahrenheit, K = Kelvin");
        System.out.print("convert ");
        String input = scanner.nextLine();
        scanner.close();
        convert(createArray(input));
        
    }

    static String[] createArray(String input) {
        // 20C to F
        String[] ValueArray = new String[3];

        input = input.trim();
        ValueArray[0] = input.substring(0, input.length() - 6);
        ValueArray[1] = String.valueOf(input.subSequence(ValueArray[0].length(), input.length() - 5)).toUpperCase();
        ValueArray[2] = input.substring(input.length() - 1).toUpperCase();
        return ValueArray;
    }

    static void convert(String[] ValueArray) {

        switch (ValueArray[1]) {
            case "C": switch (ValueArray[2]) {
                        case "F": CtoF(ValueArray[0]); break;
                        case "K": CtoK(ValueArray[0]); break;
                        };
                        break;
            case "F": switch (ValueArray[2]) {
                        case "C": FtoC(ValueArray[0]); break;
                        case "K": FtoK(ValueArray[0]); break;
                        };
                        break;
            case "K": switch (ValueArray[2]) {
                        case "C": KtoC(ValueArray[0]); break;
                        case "F": KtoF(ValueArray[0]); break;
                        };
                        break;
        }
    }

    static void CtoF(String Celsius_str){
        double Celsius = Double.parseDouble(Celsius_str);
        double Fahrenheit = 1.80 * Celsius + 32;
        System.out.println(Fahrenheit);

    }

    static void CtoK(String Celsius_str){
        double Celsius = Double.parseDouble(Celsius_str);
        double Kelvin = Celsius +  273.15;
        System.out.println(Kelvin);

    }

    static String FtoC(String Fahrenheit_str){
        double Fahrenheit = Double.parseDouble(Fahrenheit_str);
        double Celsius = (Fahrenheit-32)/1.80;
        System.out.println(Celsius);
        return Double.toString(Celsius);

    }

    static void FtoK(String Fahrenheit_str){
        CtoK(FtoC(Fahrenheit_str));
        
    }

    static void KtoC(String Kelvin_str){
        double Kelvin = Double.parseDouble(Kelvin_str);
        double Celsius = Kelvin - 273.15;
        System.out.println(Celsius);
    }

    static void KtoF(String Kelvin_str){
        double Kelvin = Double.parseDouble(Kelvin_str);
        double Fahrenheit = 1.80*(Kelvin - 273.15) + 32;
        System.out.println(Fahrenheit);
    }
}
