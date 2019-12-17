package Electronics;

public class Kindle {
    public static void main(String [] args) {
        System.out.println("I allow you to read on the go");
        Kindle myKindle = new Kindle();
        myKindle.downloadLibrary();
    }
    public void downloadLibrary() {
        System.out.println("This method allows me to download your whole library");
    }
}
