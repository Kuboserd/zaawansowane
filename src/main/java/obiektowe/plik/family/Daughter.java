package obiektowe.plik.family;

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
