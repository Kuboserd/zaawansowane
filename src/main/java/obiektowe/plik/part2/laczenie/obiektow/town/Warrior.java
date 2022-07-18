package obiektowe.plik.part2.laczenie.obiektow.town;

import obiektowe.plik.part2.laczenie.obiektow.town.Citizen;

public class Warrior extends Citizen {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public boolean canVote() {
        return true;
    }
}
