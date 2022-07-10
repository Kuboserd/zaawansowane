package obiektowe.plik.task1.samochod;

import obiektowe.plik.task2.warsztat.Kolo;

import java.util.Random;

public class Samochod {

    private Kolo[] tires;
    private String mark;
    private double mileage;
    private double mileageUntilInspection = 20_000;

    public Samochod(String mark, double mileage) {
        this.mark = mark;
        this.mileage = mileage;
    }

    public Samochod() {
    }

    void printMarkAndMileage() {
        System.out.println("Mark : " + this.mark + "\n Mileage: " + this.mileage);
    }

    void drive(double distance) {
        this.mileage += distance;
    }

    double checkMileage() {
        return this.mileageUntilInspection - mileage;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "mark='" + mark + '\'' +
                ", mileage=" + mileage +
                ", mileageUntilInspection=" + mileageUntilInspection +
                '}';
    }

    public void catchFlatTire() {
        Random random = new Random();
        this.tires[random.nextInt(this.tires.length)].interact();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Kolo[] getTires() {
        return tires;
    }

    public double getMileageUntilInspection() {
        return mileageUntilInspection;
    }

    public void setMileageUntilInspection(double mileageUntilInspection) {
        this.mileageUntilInspection = mileageUntilInspection;
    }
}
