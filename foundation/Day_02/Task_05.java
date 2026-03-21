package foundation.Day_02;

public class Task_05 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("hello");
        p.print(5.64);
        p.print(8);
    }
}

class Printer {
    public void print(int num) {
        System.out.println(num);
    }

    public void print(double num) {
        System.out.println(num);
    }

    public void print(String text) {
        System.out.println(text);
    }
}