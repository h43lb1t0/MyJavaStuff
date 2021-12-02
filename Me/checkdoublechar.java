import java.util.ArrayList;
public class checkdoublechar {
    public static void main(String[] args) {

        String a = "Hello World baba";

        ArrayList<Character> b = new ArrayList<Character>();
        ArrayList<Character> duplicates = new ArrayList<Character>();

        for (int i = 0; i < a.length(); i++) {
            char character = a.charAt(i);
            if (b.contains(character)) {
                if (!duplicates.contains(character)) {
                    duplicates.add(character);
                }
            } 
            else {
                b.add(character);
            }
        }
        System.out.println(duplicates);
    }
}
