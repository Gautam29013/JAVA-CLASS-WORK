import java.util.Scanner;

public class Function {
    public static void PrintMyName(String name ) {        
        System.out.println(name);
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();


        PrintMyName(name);
        sc.close();
    }
}
