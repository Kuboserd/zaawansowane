package obiektowe.dodatkowe.hotel.project.hotel;

import obiektowe.dodatkowe.hotel.project.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> roomList = new ArrayList<>();

    public Hotel(int roomCount) {

        for (int i = 0; i < roomCount; i++) {
            roomList.add(new Room());
        }
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Room> getVacantRoomList() {
        List<Room> tempList = new ArrayList<>();
        for (Room x : roomList) {
            if (!x.isOccupied()) {
                tempList.add(x);
            }
        }
        return tempList;
    }

    public void changeOccupation(int roomNumber){

        for(Room x : roomList){
            if(x.getNumber()==roomNumber){
                x.changeOccupation();
                return;
            }
        }
        System.out.println("There is no room of this number.");
    }

}
