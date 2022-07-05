package obiektowe.plik.citizen.town;

import obiektowe.plik.citizen.*;

public class Town {
    public static void main(String[] args) {
        Town town = new Town();
        Citizen[] citizens = {
                new King("Wilhelm Wielki"),
                new Peasant("Bob"),
                new Townsman("Grzegorz Kowalewski"),
                new Warrior("Ryan Waleczny")
        };
        System.out.println(town.howManyCanVote(citizens));
        town.whoCanVote(citizens);
    }

    private int howManyCanVote(Citizen[] citizens) {
        int result = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                result++;
            }
        }
        return result;
    }

    private void whoCanVote(Citizen[] citizens) {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }
}
