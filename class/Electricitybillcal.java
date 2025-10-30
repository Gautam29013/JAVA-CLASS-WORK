import java.util.Scanner;

public class Electricitybillcal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        if (units > 0 && units <= 100) {
            System.out.println("Bill amount: Rs." + units * 5);

        } else if (units > 100 && units <= 200){
            System.out.println("Bill amount: Rs." + units * 7);
        } else {
            System.out.println("Bill amount: Rs." + units * 7);
        }

       scanner.close();
    }
}
