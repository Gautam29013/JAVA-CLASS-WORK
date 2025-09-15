import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Available balance: " + balance);

        while(balance > 0) {
            System.out.println("Enter amount to withdraw (or 0 to exit): ");
            int amount = scanner.nextInt();

            if (amount == 0) {
                System.out.println("Exiting ATM. Thank you!");
                break;
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Please try again.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        }
        

       
        scanner.close();
    }
}
