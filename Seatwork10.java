public class Seatwork10 {

    public static void main(String[] args) {
        try {
            int[] x = {1, 2};
            // Access a valid index
            System.out.println(x[1]); // prints 2

        } catch (ArithmeticException e) {
            System.out.println("Math Error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
    }
}