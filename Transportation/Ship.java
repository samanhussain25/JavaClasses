package Transportation;

public class Ship {
    public static void main(String [] args) {
        Ship myShip = new Ship();
        myShip.sail();
    }
    String color = "Red";
    int numberOfCrewMembers = 30;
    boolean ecoFriendly = true;
    int maxSpeed = 100;

    public void sail() {
        System.out.println("My "+color+ " ship can sail at up to "+maxSpeed+" miles per hour.");
    }
}
