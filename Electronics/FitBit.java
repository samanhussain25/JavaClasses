package Electronics;

public class FitBit {
    public static void main(String [] args) {
        System.out.println("I track your fitness");
        FitBit myFitBit = new FitBit();
        myFitBit.pedometer();
    }
    public void pedometer() {
        System.out.println("This method allows me to track the number of steps you take");
    }
}
