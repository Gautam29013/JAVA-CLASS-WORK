import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "abcd123"; // you can set your own password

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter password: ");
            String enteredPassword = sc.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("✅ Correct! Access granted.");
                break; // stop loop if correct
            } else {
                System.out.println("❌ Wrong password.");
                if (i < 3) {
                    System.out.println("You have " + (3 - i) + " attempt(s) left.");
                } else {
                    System.out.println("🚫 All attempts used. Access denied.");
                }
            }
        }

        sc.close();
    }
}
