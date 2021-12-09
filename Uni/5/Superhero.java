public class Superhero {
    
    String firstName;
    String lastName;
    int yearOfBirth;
    String companion = null;
    int herocoins = 0;

    /**
     * @param firstName
     * @param lastName
     * @param yearOfBirth
     */
    public Superhero(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Add a companion to the superhero and check if he already has one. Only if he doesn't have one yet, you can add one
     * @param name
     */
    public void setCompanion(String name) {
        if (this.companion == null) {
            this.companion = name;
        }
        else {
            System.out.println("your superhero already has a companion");
        }
    }

    /**
     * adds n amount of Herocoins to the hero
     * @param amount
     */
    public void addHerocoins(int amount) {
        this.herocoins += amount;
    }

    /**
     * @return first name of the superhero
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * @return last name of the superhero
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return year of birth of the superheo
     */
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    /**
     * @return the superheros companion
     */
    public String getCompanion() {
        return this.companion;
    }

    /**
     * @return the ammount of herocoins the superheo has
     */
    public int getHerocoins() {
        return this.herocoins;
    }

    /**
     * Outputs all 5 properties of the superhero in one text.
     */
    public void print() {
        System.out.println("The Hero " + this.firstName + " " + this.lastName + " was born in " + this.yearOfBirth + ". His companion is " + this.companion + " and he has " + this.herocoins + " herocoins");
    }
}