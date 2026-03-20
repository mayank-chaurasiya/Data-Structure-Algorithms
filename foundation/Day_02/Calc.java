package foundation.Day_02;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// method overriding
class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    void draw() {
        System.out.println("Rectangle");
    }
}

public class Calc {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        Shape[] shapes = { new Circle(), new Rect() };
        for (Shape sh : shapes)
            sh.draw();
    }
}
