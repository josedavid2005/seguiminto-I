package TernaryOperator;
import java.util.Scanner;

public class Grade { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the exam score: ");
    double score = sc.nextDouble();
    String grade = (score >= 5) ? "Passed" : "Failed";
    System.out.println("The grade is " + grade);
}

}
