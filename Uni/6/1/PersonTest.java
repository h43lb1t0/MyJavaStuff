public class PersonTest {
    public static void main(String[] args) {
        Name aFathersName = new Name("Dr.", "Rolf", "H", "H");
        Adress aFtahersAdress = new Adress("Gaojing lu", "8888", 3642, "Shanghai", "China");
        Father aFather = new Father(aFathersName, 70,aFtahersAdress, "Tom", "Jonte", "Jella");

        Name aMothersName = new Name("Ute", "H", "S");
        Mother aMother = new Mother(aMothersName, 56, aFtahersAdress, "Tom", "Jonte", "Jella");

        Name tomsName = new Name("Tom", "H", "H");
        Adress tomsAdress = new Adress("abc street", "1", 10318, "Berlin", "Germany");
        Person Tom = new Person(tomsName, 20, tomsAdress, aFather, aMother);

        Name JontesName = new Name("Jonte", "H", "H");
        Person Jonte = new Person(JontesName, 11, aFtahersAdress, aFather, aMother);

        Name JellasName = new Name("Jella", "H", "H");
        Person Jella = new Person(JellasName, 12, aFtahersAdress, aFather, aMother);

        Name bMotherName = new Name("Babs", "H", "L");
        Adress bMotherAdress = new Adress("def street", "6", 25235, "Elmshorn", "Germany");
        Mother bMother = new Mother(bMotherName, 56, bMotherAdress, "Nele", "Julius", "Henny");

        Name JuliusName = new Name("Julius", "H", "H");
        Adress JuliusAdress = new Adress("ghi street", "42", 22769, "Hamburg", "Germany");
        Person Julius = new Person(JuliusName, 25, JuliusAdress, aFather, bMother);


        System.out.println("Tom and jonte are siblings: " + Tom.isSibling(Jonte));
        System.out.println("Jella is a half sibling of Julius: " + Jella.isHalfSibling(Julius));
        System.out.println("Tom and aMother lives in the same City: " + Tom.livesInTheSameCity(aMother));
        System.out.println("Jella and Jonte lives in the same City: " + Jonte.livesInTheSameCity(Jella));
        System.out.println("Jonte is: " + Tom.compareAge(Jonte) + " than Tom");
        System.out.println("Jella is: " + Jonte.compareAge(Jella) + " than Jonte");
        System.out.println("aMother and bMother are the : " + aMother.compareAge(bMother) + " age");

    }
}