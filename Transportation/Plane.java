package Transportation;

public class Plane {
    public static void main(String [] args) {
        Plane myPlane = new Plane();
        myPlane.fly();
        myPlane.control();
    }
    int maxSpeed = 1500;
    String pilotName = "Arham";
    int weight = 90000;
    int baggageLimitPerPerson = 2;

    public void fly() {
        System.out.println("My plane flies at upto" +maxSpeed +" mph");
    }
    public void control() {
        System.out.println("When the plane is not on autopilot "+ pilotName+ " controls the plane");
    }
}
