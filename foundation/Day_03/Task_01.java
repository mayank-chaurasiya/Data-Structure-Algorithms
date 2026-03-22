package foundation.Day_03;

class Student {
    String name;
    int roll_no;
    int marks[] = new int[4];

    Student(String name, int roll_no, int marks1, int marks2, int marks3) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks[0] = marks1;
        this.marks[1] = marks2;
        this.marks[3] = marks3;
    }

    double getAverage(int[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / 3;
    }

    void getGrade() {
        double avg = getAverage(marks);
        if (avg >= 80 && avg <= 100) {
            System.out.println("Grade A");
        } else if (avg >= 60 && avg <= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }
    }

    void displayResult() {
        System.out.println("student name : " + name);
        System.out.printf("average marks:  %.2f %n", getAverage(marks));
        getGrade();
    }
}

public class Task_01 {
    public static void main(String[] args) {
        Student s1 = new Student("Khushi", 420, 86, 95, 72);
        s1.displayResult();

        Student s2 = new Student("Ayush", 438, 45, 98, 92);
        s2.displayResult();
    }
}
