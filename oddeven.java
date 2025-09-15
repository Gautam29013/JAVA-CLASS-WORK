import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 ==0) {
            System.out.println("this number is even");
        } else{
            System.out.println(" this number is odd");
            sc.close();
        }

    }
}
