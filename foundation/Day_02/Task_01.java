package foundation.Day_02;

public class Task_01 {
    public static void main(String[] args) {
        Student s1 = new Student("Khushi");
        s1.setGrade(99);
        Student s2 = new Student("Mayank");
        s2.setGrade(100);

        s1.printInfo();
        s2.printInfo();
    }
}

class Student {
    private String name;
    private int grade;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.printf("Name: %s and Grade: %d.%n", name, grade);
    }
}