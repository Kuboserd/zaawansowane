package obiektowe.plik.warsztat;

enum TYPE {
    TIRES
}

public class Paragon {
    TYPE type;
    int ammount;
    float price;

    public Paragon(TYPE orderType, int count) {
        this.type = orderType;
        ammount = count;
        switch (orderType) {
            case TIRES:
                this.price = count * 50.80f;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "Paragon{" +
                "type=" + type +
                ", ammount=" + ammount +
                ", price=" + price +
                '}';
    }
}
