package Electronics;

public class Calculator {
    public static void main(String [] args) {
        System.out.println("I calculate operations between all kinds of numbers.");
        Calculator myCalculator = new Calculator();
        myCalculator.subtract();
    }
    public  static void subtract() {
        System.out.println("This method allows me to calculate subtraction operation");
    }
}
