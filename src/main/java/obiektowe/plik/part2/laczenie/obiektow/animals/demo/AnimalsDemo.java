package obiektowe.plik.part2.laczenie.obiektow.animals.demo;

import obiektowe.plik.part2.laczenie.obiektow.animals.Animals;
import obiektowe.plik.part2.laczenie.obiektow.animals.GrizzlyBear;
import obiektowe.plik.part2.laczenie.obiektow.animals.Monkey;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animals[] animals = {
                new GrizzlyBear(12, 1230.23f),
                new Monkey(5, 30.5f)
        };

        for (Animals x : animals) {
            x.eat();
            x.makeNoise();
        }
    }
}
