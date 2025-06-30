abstract class Vehicle {
    abstract void start();
}

class Car1 extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    class Motorcycle extends Vehicle {
        void start() {
            System.out.println("Motorcycle started");
        }
    }
}

public class Abs2 {
    public static void main(String[] args) {
        Car1 c = new Car1(); // Corrected class name
        c.start();

        // Creating object of inner class Motorcycle
        Car1.Motorcycle m = c.new Motorcycle(); // Use Car1 instead of Car
        m.start();
    }
}
