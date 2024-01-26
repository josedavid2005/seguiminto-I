package TernaryOperator;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "The number is even" : "The number is odd";
        System.out.println(result);
    }

}
