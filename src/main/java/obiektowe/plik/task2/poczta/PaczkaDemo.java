package obiektowe.plik.task2.poczta;

public class PaczkaDemo {
    public static void main(String[] args) {
        Paczka[] parcels = new Paczka[100];
        for(int i=0;i<100;i++){
            parcels[i] = new Paczka();
        }

        for(Paczka x: parcels){
            System.out.println(x.toString());
            System.out.println(x.price());
        }
    }

}
