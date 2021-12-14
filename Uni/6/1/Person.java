/**
 * Creates a general data type for a person
 * @author name  Tom Ole Haelbich
 */
public class Person {
    Name name;
    int age;
    Adress address;
    Father father;
    Mother mother;


    /**
     * Creates a person who is neither father nor mother. 
     * @param name
     * @param age
     * @param address
     * @param father
     * @param mother
     */
    Person(Name name, int age, Adress address, Father father, Mother mother) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.father = father;
        this.mother = mother;
    }

    /**
     * Creates a new parent.
     * Parents cannot have parents as this would lead to an infinite loop
     * as they would need parents again etc.
     * @param name
     * @param age
     * @param address
     */
    Person(Name name, int age, Adress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Checks whether person p is a sibling of the person on whom this function is called.
     * @param p Person to check for sibling
     * @return true when sibling else false
     */
    public boolean isSibling(Person p) {
        if (p.mother == this.mother && p.father == this.father) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Checks whether person p is a half-sibling of the person on whom this function is called.
     * @param p Person to check for sibling
     * @return true when half-sibling else false
     */
    public boolean isHalfSibling(Person p) {
        if (p.mother == this.mother ^ p.father == this.father) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if both persons live in the same city.
     * @param p Person
     * @return true when they live in the same city else false
     */
    public boolean livesInTheSameCity(Person p) {
        if (p.getAddress().city == this.address.city) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks whether the person p is younger,
     * older or the same age as the person on whom this function is called.
     * @param p Person to compare age with
     * @return String with message about the age check 
     */
    public String compareAge(Person p) {
        if (p.getAge() == this.age) {
            return "same";
        } else if (p.getAge() < this.age) {
            return "younger";
        } else {
            return "older";
        }
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAddress() {
        return this.address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public Father getFather() {
        return this.father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return this.mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }
}