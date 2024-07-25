import java.util.*;

class Car {
    String name;
    String color;
    int year;
    int maxSpeed;

    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

class Lec07 {
    public static void main(String[] args) {
        // Car example
        Car polo = new Car();
        System.out.println("Initial values:");
        System.out.println("Name: " + (polo.name == null ? "Not set" : polo.name));
        System.out.println("Color: " + (polo.color == null ? "Not set" : polo.color));
        System.out.println("Year: " + polo.year);
        System.out.println("Max Speed: " + polo.maxSpeed);

        // Assign values
        polo.name = "Polo";
        polo.color = "Red";
        polo.year = 2016;
        polo.maxSpeed = 120;

        System.out.println("\nUpdated values:");
        System.out.println("Name: " + polo.name);
        System.out.println("Color: " + polo.color);
        System.out.println("Year: " + polo.year);
        System.out.println("Max Speed: " + polo.maxSpeed);

        // ControlFlow example
        ControlFlow cf = new ControlFlow();
        cf.executeControlFlow();
    }
}

class ControlFlow {
    int findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    void executeControlFlow() {
        // Student example
        Student s1 = new Student();
        s1.name = "Ram";
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Sham";
        s2.marks = 30;

        System.out.println("\nStudent Results:");
        System.out.println(s1.name + " has " + s1.marks + " marks. Passed: " + s1.checkPass());
        System.out.println(s2.name + " has " + s2.marks + " marks. Passed: " + s2.checkPass());

        // Finding max of three numbers
        System.out.println("The Max of three numbers is: " + findMax(10, 7, 15));

        // Switch-case example
        char c = 'a';
        System.out.println("\nSwitch-Case Example:");
        switch (c) {
            case 'a':
                System.out.println("Hi, I'm A");
                break;
            case 'b':
                System.out.println("Hi, I'm B");
                break;
            case 'c':
                System.out.println("Hi, I'm C");
                break;
            default:
                System.out.println("I'm not A, B, or C");
        }
    }
}

class Student {
    String name;
    int marks;

    boolean checkPass() {
        return marks >= 40;
    }
}
