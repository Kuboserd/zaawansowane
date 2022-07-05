package obiektowe.plik.poczta;

import java.util.regex.Pattern;

public class Paczka {
    private String recipient;
    private String sender;
    private float weight;
    private boolean priority = false;

    public Paczka(String recipient, String sender, float weight) {
        if (nameValidator(recipient)) {
            this.recipient = recipient;
        } else {
            System.out.println("Inserted wrong name!");
            this.recipient = "";
        }
        if (nameValidator(sender)) {
            this.sender = sender;
        } else {
            System.out.println("Inserted wrong name!");
            this.sender = "";
        }
        if (weight < 100_000 && weight > 1) {
            this.weight = weight;
        } else {
            System.out.println("Inserted wrong weigth");
            this.weight = 0;
        }
    }

    private static boolean nameValidator(String name) {
        Pattern pattern = Pattern.compile("^([a-zA-Z]+\\s[a-zA-Z]?'?-?[a-zA-Z]?\\s?([a-zA-Z]{1,})?)");
        return pattern.matcher(name).matches();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                '}';
    }
}
