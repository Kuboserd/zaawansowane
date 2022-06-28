package obiektowe.plik.samochod;

public class Samochod {
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

    public double getMileageUntilInspection() {
        return mileageUntilInspection;
    }

    public void setMileageUntilInspection(double mileageUntilInspection) {
        this.mileageUntilInspection = mileageUntilInspection;
    }
}
