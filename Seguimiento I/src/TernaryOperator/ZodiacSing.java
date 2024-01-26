package TernaryOperator;
import java.util.Scanner;
public class ZodiacSing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of birth: ");
        int day = sc.nextInt();
        System.out.println("Enter the month of birth: ");
        int month = sc.nextInt();
        String sign = "";
        switch (month) {
            case 1:
                sign = (day <= 20) ? "Capricorn" : "Aquarius";
                break;
            case 2:
                sign = (day <= 19) ? "Aquarius" : "Pisces";
                break;
            case 3:
                sign = (day <= 20) ? "Pisces" : "Aries";
                break;
            // ... (Continue for the remaining months)
            default:
                sign = "Invalid month";
        }
        System.out.println("The zodiac sign is " + sign);
    }

}
