package foundation.Day_02;

public class Car {
    public static void main(String[] args) {
        Cars myCar = new Cars("Toyota", 60);
        myCar.accelerate(20);
    }
}

class Cars {
    // Fields (Attributes)
    private String brand;
    private int speed;

    // constructor
    public Cars(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    // method
    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " goes " + speed + " km/h.");
    }
}
