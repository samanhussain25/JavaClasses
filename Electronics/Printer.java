package Electronics;

public class Printer {
    public static void main(String [] args) {
        System.out.println("I print information on papers");
        Printer myPrinter = new Printer();
        myPrinter.color();
    }
    public void color() {
        System.out.println("This method allows me to print in color");
    }
}
