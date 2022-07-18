package obiektowe.plik.part2.laczenie.obiektow.dom.poczta;

public class PaczkaDemo {
    public static void main(String[] args) {
        Paczka[] parcels = new Paczka[3];
        parcels[0] = new Paczka();
        parcels[1] = new Paczka("Karol Wojciaszek", "Ktos Jakistam",50);
        parcels[2] = new Paczka();
        System.out.println(printWithSum(parcels));


    }

    private static void print(Paczka[] parcels){
        for(Paczka x: parcels){
            System.out.println(x.toString());
            System.out.println(x.price());
        }
    }
    private static float printWithSum(Paczka[] parcels){
        float sum=0;
        for(Paczka x: parcels){
            System.out.println(x.toString());
            System.out.println(x.price());
            sum+=x.price();
        }
        return sum;
    }
}
