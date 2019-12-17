package Practice;

public class Parameters2 {
    public static void main(String [] args) {
        Parameters2 param2 = new Parameters2();
        param2.multiplication(6, 4);
        param2. division(5,3);
        Parameters param1 = new Parameters();
        param1.subtraction(6, 3);
    }
    public void multiplication(int s, int z) {
        System.out.println("Product is "+(s*z));
    }
    public void division(int s, int z) {
        System.out.println("Dividend is "+(s/z));
    }
}
