package obiektowe.plik.animals;

public class GrizzlyBear extends Animals {

    public GrizzlyBear(int age, float weight) {
        super(age, weight);
    }

    void goFishing(){
        System.out.println("Bear just caught a trout!");
    }
    @Override
    public void makeNoise(){
        System.out.println("Bear roars");
    }
    @Override
    public void eat(){
        System.out.println("Bear ate some fish!");
    }
}
