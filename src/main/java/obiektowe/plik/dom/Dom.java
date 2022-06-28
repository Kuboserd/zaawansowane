package obiektowe.plik.dom;

import java.util.Arrays;

public class Dom {
    Pokoj[] rooms;

    public Dom(Pokoj[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
