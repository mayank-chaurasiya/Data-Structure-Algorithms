package foundation.Day_02;

public class Task_02 {
    public static void main(String[] args) {

        Vehicle[] v = { new Car("Toyota"), new Bike("Yamaha") };

        for (Vehicle x : v) {
            x.speed();
        }
    }
}

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void speed() {
        System.out.println(brand + " their speed");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void speed() {
        System.out.println(brand + " 120km/h");
    }
}

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    @Override
    void speed() {
        System.out.println(brand + " 100km/h");
    }
}