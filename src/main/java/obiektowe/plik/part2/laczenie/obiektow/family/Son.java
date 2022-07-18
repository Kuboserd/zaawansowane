package obiektowe.plik.part2.laczenie.obiektow.family;

public class Son implements FamilyMember{

    @Override
    public void greetings() {
        System.out.println("who's asking?");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
