import java.util.Scanner;
public class Binarycount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String binaryRepresentation = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binaryRepresentation);
        int countOnes = 0;
        int countZeros = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char bit = binaryRepresentation.charAt(i);
            if (bit == '1') {
                countOnes++;
            } else if (bit == '0') {
                countZeros++;
            }
        }
        System.out.println("Number of ones: " + countOnes);
        System.out.println("Number of zeros: " + countZeros);
        scanner.close();
    }
}
