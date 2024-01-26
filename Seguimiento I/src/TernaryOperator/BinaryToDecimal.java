package TernaryOperator;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = (binary.charAt(i) == '1') ? 1 : 0;
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println("The decimal number is " + decimal);
    }


}
