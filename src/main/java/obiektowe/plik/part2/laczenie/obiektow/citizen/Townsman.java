package obiektowe.plik.part2.laczenie.obiektow.citizen;

public class Townsman extends Citizen{

    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
