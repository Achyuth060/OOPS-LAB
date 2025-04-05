class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

public class SingleInheritanceVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}
