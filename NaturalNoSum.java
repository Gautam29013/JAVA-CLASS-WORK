import java.util.Scanner;

public class NaturalNoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1 ; i <=n ; i++){
            sum = sum + i;
        }
        System.out.print("sum :");
        System.out.println(sum);
        sc.close();
    }
}
