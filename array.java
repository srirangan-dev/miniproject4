import java.util.Scanner;

class Person {
    String[] studentNames;
    int[] studentAges;
    int n;

    void numStudent() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        n = scan.nextInt();
        scan.nextLine(); // consume newline

        studentNames = new String[n];
        studentAges = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name: ");
            studentNames[i] = scan.nextLine();

            System.out.print("Enter the age: ");
            studentAges[i] = scan.nextInt();
            scan.nextLine(); // consume newline
        }
    }

    void display() {
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + studentNames[i]);
            System.out.println("Age: " + studentAges[i]);
        }
    }
}

class Student extends Person {
    int rollno;
    int m1, m2, m3;

    Scanner s = new Scanner(System.in);

    void getStudentDetail() {
        System.out.print("Enter the roll number: ");
        rollno = s.nextInt();

        System.out.print("Enter Mark 1: ");
        m1 = s.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = s.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = s.nextInt();
    }

    double cavg() {
        return (m1 + m2 + m3) / 3.0;
    }

    double cpercentage() {
        return ((m1 + m2 + m3) / 300.0) * 100;
    }

    void displays() {
        System.out.println("\nAcademic Details:");
        System.out.println("Roll No: " + rollno);
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
        System.out.println("Average: " + cavg());
        System.out.println("Percentage: " + cpercentage());
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.numStudent();
        obj.getStudentDetail();

        obj.display();
        obj.displays();
    }
}
