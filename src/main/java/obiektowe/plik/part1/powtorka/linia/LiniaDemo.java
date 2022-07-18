package obiektowe.plik.part1.powtorka.linia;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia[] lines = {
                new Linia(6, 'o'),
                new Linia(10, '%'),
                new Linia(14, '#')
        };
        for (Linia x : lines) {
            x.printLine();
            System.out.println();
        }
        Prostokat[] rectangles = {
                new Prostokat(10, 10, 'o'),
                new Prostokat(5, 10, 'o'),
                new Prostokat(10, 5, 'o')
        };
        for (Prostokat x : rectangles) {
            x.printRectangle();
            System.out.println();
        }
        FabyrkaLinii fabyrkaLinii = new FabyrkaLinii();
        fabyrkaLinii.randomFillingLinia(2).printLine();
        fabyrkaLinii.randomLenghtLinia('a').printLine();
        fabyrkaLinii.fullRandomLinia().printLine();
        Linia[] temp = fabyrkaLinii.fullRandomLinie(4);
        for(Linia x:temp){
            x.printLine();
        }
        fabyrkaLinii.incrementLinie().printLine();
        fabyrkaLinii.incrementLinie().printLine();
    }
}
