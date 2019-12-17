package Electronics;

public class SmartWatch {
    public static void main(String [] args) {
        System.out.println("I tell time and do much more");
        SmartWatch mySmartWatch = new SmartWatch();
        mySmartWatch.tellTime();
        mySmartWatch.receiveCalls();
        mySmartWatch.replyMessages();
    }
    public void tellTime() {
        System.out.println("This method allows me to tell time.");
    }
    public void receiveCalls() {
        System.out.println("This method allows me to receive Calls.");
    }
    public void replyMessages() {
        System.out.println("This method allows me to reply to messages.");
    }
}
