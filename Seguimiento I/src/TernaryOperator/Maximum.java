package TernaryOperator;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int maximum = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum is " + maximum);
    }
}