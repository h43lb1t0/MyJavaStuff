public class x2arrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "BMW";
        cars[0][1] = "VW";
        cars[0][2] = "Audi";
        cars[1][0] = "Paul";
        cars[1][1] = "Peter";
        cars[1][2] = "Ludwig";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[j][i] + " ");
            }
        }

        String[][] cars2 = {{"BMW", "VW", "Audi"},
                            {"Paul", "Ludwig", "Peter"},
                            {"1","2","3"}};

        for (int i = 0; i < cars2.length; i++) {
            System.out.println();
            for (int j = 0; j < cars2[i].length; j++) {
                System.out.print(cars2[j][i] + " ");
            }
        }
    }
}
