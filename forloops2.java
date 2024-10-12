import java.util.Scanner;

public class forloops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (maxNum): ");
        int maxNum = scanner.nextInt();

        if (maxNum < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            long product = 1;  // Initialize the product to 1

            for (int i = 1; i <= maxNum; i += 2) {
                // Multiply only odd integers
                product *= i;
            }

            System.out.println("The product of odd integers from 1 to " + maxNum + " is: " + product);
        }

        scanner.close();
    }
}