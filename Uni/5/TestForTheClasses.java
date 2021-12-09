public class TestForTheClasses {
    public static void main(String[] args) {

        Superhero Tom = new Superhero("Tom", "H", 2001);
        Superhero Jonte = new Superhero("Jonte", "H", 2009);
        SuperheroTeam DieCoolen = new SuperheroTeam("Die Coolen", Tom, Jonte);
        Tom.setCompanion("Jonte");
        Tom.addHerocoins(42);
        Jonte.setCompanion("Tom");

        DieCoolen.addSuperhero(Tom);
        DieCoolen.addSuperhero(Jonte);

        //DieCoolen.deleteSuperhero("Tom", "H");

        DieCoolen.print();

       /*  for (Superhero superhero : DieCoolen.team) {
            if (superhero != null) {
                System.out.println(superhero.firstName);
            }
        } */
    }
}
