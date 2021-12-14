public class Player {
    String name;
    int age;
    int gamesWon;
    int gamesLost;
    int gamesDraw;



    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void startGame(Player p) {
        System.out.println(p.getName() + ", ich fordere Dich zum Spiel auf!");
    }

    public void acceptGame(Player p) {
        System.out.println(p.getName() + ", ich nehme das Spiel an!");

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGamesWon() {
        return this.gamesWon;
    }

    public void setGamesWon() {
        this.gamesWon++;
    }

    public int getGamesLost() {
        return this.gamesLost;
    }

    public void setGamesLost() {
        this.gamesLost++;
    }

    public int getGamesDraw() {
        return this.gamesDraw;
    }

    public void setGamesDraw() {
        this.gamesDraw++;
    }


}