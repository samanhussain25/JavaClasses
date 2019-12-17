package Transportation;

public class Bus {
    public static void main(String [] args) {
        Bus myBus = new Bus();
        myBus.driving();
        myBus.drivingMax();

    }
    String weightCapacity = "4000 lbs";
    int numberOfSeats = 62;
    String driverName = "Ziyad";
    int maxSpeed = 180;
    int speed;

    public void driving() {
        speed = 60;
        System.out.println("Bus is driving at" +speed +"mph");
    }
    public void drivingMax() {
        System.out.println("Maximum speed the bus can reach is" +maxSpeed);
    }
}
