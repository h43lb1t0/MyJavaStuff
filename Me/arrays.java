public class arrays {
    public static void main(String[] args) {
        String[] cars = {"VW", "BMW", "Audi"};
        System.out.println(cars[0]);

        String[] cars2 = new String[3];
        cars2[0] = "VW";
        cars2[1] = "BMW";
        cars2[2] = "Audi";
        System.out.println(cars2[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars2[i]);
        }
    }
}
