package Bucle;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        while ((num = sc.nextInt()) != 0) {
            System.out.println("The entered number is: " + num);
        }
        System.out.println("End of the loop");

    }
}
