package obiektowe.plik.animals;

public class Monkey extends Animals {

    public Monkey(int age, float weight) {
        super(age, weight);
    }

    void throwPoop(){
        System.out.println("Monkey just threw poop at someone!");
    }
    @Override
    public void makeNoise(){
        System.out.println("Monkey giggles");
    }
}
