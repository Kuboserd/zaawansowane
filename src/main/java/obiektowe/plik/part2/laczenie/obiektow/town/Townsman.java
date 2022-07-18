package obiektowe.plik.part2.laczenie.obiektow.town;

import obiektowe.plik.part2.laczenie.obiektow.town.Citizen;

public class Townsman extends Citizen {

    public Townsman(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
