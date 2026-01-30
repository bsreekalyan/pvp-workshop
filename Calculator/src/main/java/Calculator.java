import java.util.Scanner;

/**
 * A simple calculator class that performs basic arithmetic operations:
 * addition, subtraction, and multiplication.
 * This class also includes a main method for interactive console-based usage.
 */
public class Calculator {

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Main method that provides an interactive console interface for the calculator.
     * Prompts the user for two numbers and an operation choice, then displays the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Simple Calculator");

        // Prompt user for the first number
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        // Prompt user for the second number
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        // Prompt user to choose an operation
        System.out.println("Choose operation: 1 for Add, 2 for Subtract, 3 for Multiply");
        int choice = scanner.nextInt();

        // Initialize result variable
        int result = 0;

        // Use switch statement to perform the chosen operation
        switch (choice) {
            case 1:
                // Perform addition
                result = calc.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                // Perform subtraction
                result = calc.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                // Perform multiplication
                result = calc.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                // Handle invalid choice
                System.out.println("Invalid choice");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}