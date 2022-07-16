package obiektowe.plik.task2.poczta;

import java.util.Random;
import java.util.regex.Pattern;

public class Paczka {
    private static final Random random = new Random();
    private Status status = Status.created;
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

    public Paczka() {
        this.recipient = randomFullName();
        this.sender = randomFullName();
        this.weight = randomWeight();
        this.priority = randomPriority();
    }

    public float price() {
        float result = 0;
        if (this.weight < 0.5f) {
            result = 5;
        } else if (this.weight < 1f) {
            result = 8;
        } else if (this.weight < 2f) {
            result = 12;
        } else {
            result = 12 + (long) (this.weight - 12);
        }
        if (this.priority) {
            result *= 1.1;
        }
        return result;
    }

    private boolean randomPriority() {
        return random.nextBoolean();
    }

    private float randomWeight() {
        return random.nextFloat(100000) + 1;
    }

    private String randomFullName() {
        StringBuilder stringBuilder = new StringBuilder();

        int maxParts = random.nextInt(4) + 1;
        int maxLetters = random.nextInt(23);
        for (int i = 0; i < maxParts; i++) {
            stringBuilder.append((char) ('A' + random.nextInt(26)));

            for (int j = 0; j < maxLetters; j++) {
                stringBuilder.append((char) ('a' + random.nextInt(26)));
            }
            if (i - 1 == maxParts) {
                break;
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
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
