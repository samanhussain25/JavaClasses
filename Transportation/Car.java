package Transportation;

public class Car {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.stop();
    }

    String color = "Blue";
    int numberOfWheels = 4;
    char model = 'S';
    int year = 19;
    int speed;

    public void drive() {

        speed = 60;
       System.out.println("The color of my car is "+color +"the model of my car is "+model+ " and when driving the speed is "+speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("The speed of the car is:" + speed);
    }



}
