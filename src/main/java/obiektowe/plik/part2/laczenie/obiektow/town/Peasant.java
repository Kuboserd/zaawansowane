package obiektowe.plik.part2.laczenie.obiektow.town;

import obiektowe.plik.part2.laczenie.obiektow.town.Citizen;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
