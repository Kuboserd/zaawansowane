package obiektowe.plik.part2.laczenie.obiektow.warsztat;

import obiektowe.plik.part1.powtorka.samochod.Samochod;

public class Warsztat {

    public Paragon repairWheels(Samochod car) {
        int counter = 0;
        for (Kolo x : car.getTires()) {
            if (x.isFlat()) {
                x.interact();
                counter++;
            }
        }
        return new Paragon(TYPE.TIRES, counter);
    }
}
