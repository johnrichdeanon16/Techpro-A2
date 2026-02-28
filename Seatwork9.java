import java.util.ArrayList;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student Created: " + name);
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Instead of finalize, use an explicit cleanup method
    void cleanup() {
        System.out.println("Cleaning up Student object: " + name);
    }
}

public class Seatwork9 {
    public static void main(String[] args) {
        System.out.println("=== Student Record System Started ===");

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Juan"));
        students.add(new Student(2, "Maria"));
        students.add(new Student(3, "Pedro"));

        System.out.println("\n--- Displaying Student Records ---");
        for (Student s : students) {
            s.displayInfo();
        }

        System.out.println("\n--- Removing Student Records ---");
        Student removed1 = students.remove(0);
        Student removed2 = students.remove(0);

        // Explicit cleanup instead of relying on finalize
        removed1.cleanup();
        removed2.cleanup();

        System.out.println("\n--- Creating Temporary Student Objects ---");
        for (int i = 4; i <= 20; i++) {
            Student temp = new Student(i, "TempStudent" + i);
            temp.cleanup(); // explicitly clean up
        }

        System.out.println("\n--- Clearing Remaining References ---");
        students.clear();

        System.out.println("\n=== Program Ended ===");
    }
}