package obiektowe.plik.part2.laczenie.obiektow.dom.poczta;

public class PocztaDemo {
    public static void main(String[] args) {
        Poczta poczta = new Poczta();
        Paczka temp = poczta.createParcel();
        System.out.println("Here's your change: " + poczta.sendParcel(temp, 10000));
    }
}
