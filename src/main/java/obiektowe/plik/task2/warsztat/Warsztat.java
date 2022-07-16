package obiektowe.plik.task2.warsztat;

import obiektowe.plik.task1.samochod.Samochod;

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
