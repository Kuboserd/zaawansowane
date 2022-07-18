package obiektowe.dodatkowe.hotel.project.hotel;

import obiektowe.dodatkowe.hotel.project.room.Room;

import java.util.Scanner;

public class UserService {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(15);
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("\n\n\t Norton Hotel");
            System.out.println("1.List rooms");
            System.out.println("2.List vacant rooms");
            System.out.println("3.Check in");
            System.out.println("4.Check out");
            System.out.println("5.Glad to be of service to you");

            switch (scanner.nextInt()){
                case 1:
                    for(Room x :hotel.getRoomList()){
                        System.out.println(x.toString());
                    }
                    break;
                case 2:
                    for(Room x :hotel.getVacantRoomList()){
                        System.out.println(x.toString());
                    }
                    break;
                case 3:
                    System.out.println("Which room would you like to rent?");
                    hotel.changeOccupation(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Which room were you occupying?");
                    hotel.changeOccupation(scanner.nextInt());
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
