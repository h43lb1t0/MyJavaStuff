public class SuperheroTeam {

    String teamName;
    int depot = 0;
    Superhero firstCaptain, secondCaptain;
    Superhero[] team = new Superhero[10];

    /**
     * created a superhero team with name and and two captains
     * @param teamName
     * @param firstCaptain
     * @param secondCaptain
     */
    public SuperheroTeam(String teamName, Superhero firstCaptain, Superhero secondCaptain) {
        this.teamName = teamName;
        this.firstCaptain = firstCaptain;
        this.secondCaptain = secondCaptain;
    }

    /**
     * Add a superhero to the team, but only if there is an available spot in the team. 
     * Otherwise it will be output that the team is already full
     * @param superhero
     */
    public void addSuperhero (Superhero superhero) {
        for (int i = 0; i < this.team.length; i++) {
            if (this.team[this.team.length -1] != null) {
                System.out.println("your team already has 10 members");
                break;
            } else if (this.team[i] == null) {
                this.team[i] = superhero;
                break;
            }
        }
    }

    /**
     * change the first captain
     * @param firstCaptain
     */
    public void setFirstCaptain(Superhero firstCaptain) {
        this.firstCaptain = firstCaptain;
    }

    /**
     * change the second captain
     * @param secondCaptain
     */
    public void setSecondCaptain(Superhero secondCaptain) {
        this.secondCaptain = secondCaptain;
    }

    /**
     * @return team name
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return depot
     */
    public int getDepot() {
        return this.depot;
    }

    /**
     * @return first captain of the team
     */
    public Superhero getFirstCaptain() {
        return this.firstCaptain;
    }

    /**
     * @return second captain of the team
     */
    public Superhero getSecondCaptain() {
        return this.secondCaptain;
    }

    /**
     * @return the team members as an array
     */
    public Superhero[] getTeam() {
        return this.team;
    }

    /**
     * deletes a team member based on his name.
     * @param firstName
     * @param lastName
     */
    public void deleteSuperhero(String firstName, String lastName) {
        int i = 0;
        for (Superhero superhero : this.team) {
            if (superhero != null && superhero.firstName == firstName && superhero.lastName == lastName) {
                this.team[i] = null;
            }
            i++;
        }
    }

    /**
     * returns all properties of the team and the names of the team members
     */
    public void print() {
        System.out.println(
        "Team name: " + this.teamName +
        "\ndepot: " + this.depot +
        "\ncaptains: first: " + this.firstCaptain.firstName + " " + this.firstCaptain.lastName + " second: " + this.secondCaptain.firstName + " " + this.secondCaptain.lastName
        );
        for (Superhero superhero : this.team) {
            if (superhero != null) {
                System.out.println(superhero.firstName + " " + superhero.lastName);
            }
        }
    }
}
