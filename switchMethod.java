import java.util.Scanner;

public class switchMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int botton = sc.nextInt();

        switch (botton) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid option selected");
        }
        sc.close();
    }
}
