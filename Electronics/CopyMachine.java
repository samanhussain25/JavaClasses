package Electronics;

public class CopyMachine {
    public static void main(String [] args) {
        System.out.println("I make copies of your documents");
        CopyMachine myCopyMachine = new CopyMachine();
        myCopyMachine.scan();
    }
    public void scan() {
    System.out.println("This method allows me to scan the documents to be copied");
    }
}
