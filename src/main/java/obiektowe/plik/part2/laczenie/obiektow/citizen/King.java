package obiektowe.plik.part2.laczenie.obiektow.citizen;

public class King extends Citizen {

    public King(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
