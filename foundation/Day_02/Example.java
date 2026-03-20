package foundation.Day_02;

public class Example {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");
        myDog.sound();
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // calls parent class's constructor
    }

    @Override // override parent class method
    void sound() {
        System.out.println(name + " barks.");
    }
}