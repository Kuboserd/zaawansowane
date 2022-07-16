package obiektowe.plik.family;

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
