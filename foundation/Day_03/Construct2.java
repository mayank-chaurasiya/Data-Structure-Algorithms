package foundation.Day_03;

class Car {
    String brand;
    int speed;

    /* Parameterized constructor -- takes values at creating time */
    Car(String brand, int speed) {
        this.brand = brand; // this refers to the current object
        this.speed = speed; // "this.speed" is a field && "speed" is a parameter
    }
}

public class Construct2 {
    public static void main(String[] args) {
        // usage
        Car newCar = new Car("Unknown", 120);
        System.out.println(newCar.brand + " & " + newCar.speed);
    }
}
