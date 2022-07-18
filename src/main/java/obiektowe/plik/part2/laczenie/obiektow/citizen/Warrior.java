package obiektowe.plik.part2.laczenie.obiektow.citizen;

public class Warrior extends Citizen{

    public Warrior(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
