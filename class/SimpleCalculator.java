import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // menu
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break; // exit loop
            }

            // take two numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // perform operation
            if (choice == 1) {
                System.out.println("Result: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Result: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Result: " + (num1 * num2));
            } else if (choice == 4) {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
