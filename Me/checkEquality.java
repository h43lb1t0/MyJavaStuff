public class checkEquality {
    public static void main(String[] args) {
        boolean equal = isEqual(5, 5);
        System.out.println(equal);
    }
    public static boolean isEqual(int num1, int num2) {
		if (num1 == num2) {
            return true;
        } else{
            return false;
        }
    }
}
