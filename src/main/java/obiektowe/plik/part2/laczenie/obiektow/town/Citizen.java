package obiektowe.plik.part2.laczenie.obiektow.town;

public abstract class Citizen {
    protected String name;

    public Citizen(String name) {
        this.name = name;
    }

    public abstract boolean canVote();

    public String getName() {
        return name;
    }
}
