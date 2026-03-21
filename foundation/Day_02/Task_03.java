package foundation.Day_02;

public class Task_03 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(2), new Rectangle(2, 6) };

        for (Shape sh : shapes) {
            System.out.println(sh.area());
            ;
        }
    }
}

class Shape {
    double radius, length, width;

    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}