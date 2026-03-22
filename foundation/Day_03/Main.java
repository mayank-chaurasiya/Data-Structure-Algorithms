package foundation.Day_03;

/* Blueprint: defines what a dog IS and what it CAN DO */
class Dog {
    /* Fields ( state / attributes ) */
    String name;
    String breed;
    int age;

    /* Method ( Behavior ) */
    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        /* 'new' keyword creates an object in memory (heap) */
        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.breed = "Labrador";
        dog1.age = 4;

        Dog dog2 = new Dog();
        dog2.name = "Bella";
        dog2.breed = "Poodle";
        dog2.age = 6;

        dog1.bark();
        dog2.bark();
    }
}