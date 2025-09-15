import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(num));

        sc.close();
    }
}
 