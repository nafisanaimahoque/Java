import java.util.Scanner;
public class Integerdivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        scanner.close();
        if (denominator == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = divideUsingSubtraction(numerator, denominator);
            System.out.println("Result of division: " + quotient);
        }
    }
    public static int divideUsingSubtraction(int numerator, int denominator) {
        if (numerator < denominator) {
            return 0;
        }
        int quotient = 0;
        while (numerator >= denominator) {
            numerator -= denominator;
            quotient++;
        }
        return quotient;
    }
}
