package foundation.Day_03;

class Car {
    String brand;
    int speed;

    /* Default constructor example */
    Car() {
        brand = "Unknown";
        speed = 0;
        System.out.println("A new car was created!");
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Car newCar = new Car(); // it simply prints the A new car was created
        System.out.println(newCar); // no need of this line
    }
}
