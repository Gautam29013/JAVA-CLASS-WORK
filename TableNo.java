import java.util.Scanner;

public class TableNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        for(int i = 1 ; i < 11 ; i++){
            System.out.println(i*n);
            sc.close();
        }
    }
}
