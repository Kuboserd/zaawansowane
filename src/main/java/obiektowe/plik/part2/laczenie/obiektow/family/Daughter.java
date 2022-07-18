package obiektowe.plik.part2.laczenie.obiektow.family;

public class Daughter implements FamilyMember{

    @Override
    public void greetings() {
        System.out.println("I'm daughter :)");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
