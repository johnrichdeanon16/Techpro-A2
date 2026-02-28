 import java.util.Scanner;

public class Seatwork1 {

    // Returns a letter grade based on the average
    static char gradeFunction(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        do {
            System.out.print("How many grades (1 to 5)? ");
            count = scanner.nextInt();
            if (count < 1 || count > 5) {
                System.out.println("Please enter a number between 1 and 5.");
            }
        } while (count < 1 || count > 5);

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / count;
        char letterGrade = gradeFunction(average);

        System.out.printf("Average: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}