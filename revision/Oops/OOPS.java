package revision.Oops;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(8);

        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class BankAccount {
    
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Animal {
    String type;
    int count;

    void setType(String newType) {
        type = newType;
    }

    void setCount(int newCount) {
        count = newCount;
    }
}
