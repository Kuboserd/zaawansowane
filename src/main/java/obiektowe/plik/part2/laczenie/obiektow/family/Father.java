package obiektowe.plik.part2.laczenie.obiektow.family;

public class Father implements FamilyMember{
    @Override
    public void greetings() {
        System.out.println("I am your father!");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
