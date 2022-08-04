package obiektowe.zajecia.functional.programing;

public class Functions {

    Equation addition = new Equation() {
        @Override
        public double evaluate(double number1, double number2) {
            return number1 + number2;
        }
    };

    Equation subtraction = (number1, number2) -> number1 - number2;

}


interface Equation {
    public double evaluate(double number1, double number2);
}