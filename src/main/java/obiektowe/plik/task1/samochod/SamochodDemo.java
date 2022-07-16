package obiektowe.plik.task1.samochod;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod[] cars = {
                new Samochod("Volvo",15000),
                new Samochod("BMW",0),
                new Samochod("Opel", 20000)
        };
        for(Samochod x :cars){
            x.printMarkAndMileage();
        }
    }
}
