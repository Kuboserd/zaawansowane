package obiektowe.dodatkowe.hotel.project.room;

import java.util.Random;

public class Room {

    private static int ROOM_NUMBER = 1;

    private int number;
    private int capacity;
    private boolean hasToilet;
    private boolean occupied;

    public Room() {

        Random random = new Random();
        number = ROOM_NUMBER++;
        capacity = random.nextInt(4) + 1;
        hasToilet = random.nextBoolean();
        occupied = random.nextBoolean();

    }

    public Room(int number, int capacity, boolean hasToilet, boolean occupied) {

        this.number = number;
        this.capacity = capacity;
        this.hasToilet = hasToilet;
        this.occupied = occupied;

    }

    public boolean isOccupied(){
        return occupied;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", capacity=" + capacity +
                ", hasToilet=" + hasToilet +
                ", occupied=" + occupied +
                '}';
    }

    public void changeOccupation(){
        this.occupied = !this.occupied;
    }
}
