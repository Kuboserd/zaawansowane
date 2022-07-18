package obiektowe.plik.part2.laczenie.obiektow.family;

public interface FamilyMember {
    default void greetings(){
        System.out.println("I am just a siple family member");
    };
    boolean isAdult();
}
