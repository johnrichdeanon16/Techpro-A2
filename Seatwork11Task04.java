import java.util.InputMismatchException;
import java.util.Scanner;

public class Seatwork11Task04 {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // (e.g. dividing by zero, file not found, mismatched input type)

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");

        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");

        } catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong");

        } finally {
            System.out.println("This always executes");
        }
    }
}