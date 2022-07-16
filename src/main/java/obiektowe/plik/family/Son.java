package obiektowe.plik.family;

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
