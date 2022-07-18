package obiektowe.plik.part2.laczenie.obiektow.family;

public class Mother implements FamilyMember{
    @Override
    public void greetings() {
        System.out.println("I'm mother!");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
