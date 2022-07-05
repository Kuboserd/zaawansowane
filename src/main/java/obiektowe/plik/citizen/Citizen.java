package obiektowe.plik.citizen;

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