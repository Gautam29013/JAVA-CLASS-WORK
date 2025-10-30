import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        // take marks of 5 subjects
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        // calculate percentage
        double percentage = totalMarks / 5.0;
        System.out.println("Percentage: " + percentage + "%");

        // assign grade
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        sc.close();
    }
}
