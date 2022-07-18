package obiektowe.plik.part2.laczenie.obiektow.dom.poczta;

import java.util.Scanner;

public class Poczta {

    private List[] lists = new List[10];
    private double revenue = 0;
    private Paczka
            latestParcel = null;

    public float sendParcel(Paczka parcel, float money) {
        if (parcel.price() > money) {
            return money;
        }

        parcel.setStatus(Status.sent);
        revenue += parcel.price();
        return money - parcel.price();
    }

    public Paczka createParcel() {

        Scanner scanner = new Scanner(System.in);
        String recipient, sender;
        float weight;

        System.out.println("Who's the reciepient?");
        recipient = scanner.nextLine();
        System.out.println("What's your name, Sir?");
        sender = scanner.nextLine();
        System.out.println("What's the total weight of this parcel?");
        weight = scanner.nextFloat();

        latestParcel = new Paczka(recipient, sender, weight);
        return latestParcel;
    }

    public List createList() {
       /*
       Nie robię tego, bo jest zbyt podobne do poprzedniego, jedyna różnica, to operacje na tablicy, które mam w małym paluc
        */
        return null;
    }

    public Paczka getLatestParcel() {
        return latestParcel;
    }
}
