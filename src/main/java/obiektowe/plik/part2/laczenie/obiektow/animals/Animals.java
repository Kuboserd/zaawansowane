package obiektowe.plik.part2.laczenie.obiektow.animals;

public abstract class Animals {
    private int age;
    private float weight;

    public Animals(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal ate some food!");
    }
    public abstract void makeNoise();
}
