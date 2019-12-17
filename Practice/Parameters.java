package Practice;

public class Parameters {

    public void addition(int a, int b){
        System.out.println("Sum is "+(a+b));

    }
    public static void main(String [] args) {
        Parameters params = new Parameters();
        params.addition(12, 12);
        params.addition(13, 13);
        params.subtraction(20,30);
    }
    public void subtraction(int x, int y) {
        System.out.println("Difference is"+(x-y));
    }








}
