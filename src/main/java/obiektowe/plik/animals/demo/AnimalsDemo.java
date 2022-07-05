package obiektowe.plik.animals.demo;

import obiektowe.plik.animals.Animals;
import obiektowe.plik.animals.GrizzlyBear;
import obiektowe.plik.animals.Monkey;

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
