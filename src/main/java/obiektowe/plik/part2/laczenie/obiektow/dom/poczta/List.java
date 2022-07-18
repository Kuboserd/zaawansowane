package obiektowe.plik.part2.laczenie.obiektow.dom.poczta;

public class List {
    private Address recipientAddress, senderAddress;
    private boolean priority = false;
    private Status status = Status.created;

    public List(Address recipientAddress, Address senderAddress) {
        this.recipientAddress = recipientAddress;
        this.senderAddress = senderAddress;
    }

    public float price() {
        if (priority) {
            return 8.5f;
        }
        return 6;
    }
}
