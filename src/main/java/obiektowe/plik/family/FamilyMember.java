package obiektowe.plik.family;

public interface FamilyMember {
    default void greetings(){
        System.out.println("I am just a siple family member");
    };
    boolean isAdult();
}
