public class Name {
    String title;
    String firstName;
    String lastName;
    String birthName;

    public Name(String title, String firstName, String lastName, String birthName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthName = birthName;
    }

    public Name(String firstName, String lastName, String birthName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthName = birthName;
    }
}
