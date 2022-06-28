package obiektowe.plik.linia;

import java.util.Random;

public class FabyrkaLinii {
    static int length = 2;

    Linia randomLenghtLinia(char filling) {
        Random rand = new Random();
        return new Linia(rand.nextInt(100), filling);
    }

    Linia randomFillingLinia(int length) {
        Random rand = new Random();
        return new Linia(length, (char) ('a' + rand.nextInt(('z' - 'a'))));
    }

    Linia fullRandomLinia() {
        Random rand = new Random();
        return new Linia(rand.nextInt(100), (char) ('a' + rand.nextInt(('z' - 'a'))));
    }

    Linia[] fullRandomLinie(int count) {
        Linia[] result = new Linia[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            result[i] = new Linia(rand.nextInt(100), (char) ('a' + rand.nextInt(('z' - 'a'))));
        }
        return result;
    }

    Linia incrementLinie() {
        Random rand = new Random();
        Linia temp = new Linia(length, (char) ('a' + rand.nextInt(('z' - 'a'))));
        length += 2;
        return temp;
    }
}
