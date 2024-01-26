package Bucle;
import java.util.Random;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int secret = r.nextInt(10) + 1;
        int guess;
        do {
            System.out.println("Guess the secret number between 1 and 10: ");
            guess = sc.nextInt();
            if (guess < secret) {
                System.out.println("The secret number is higher");
            } else if (guess > secret) {
                System.out.println("The secret number is lower");
            } else {
                System.out.println("Congratulations, you've guessed the secret number!");
            }
        } while (guess != secret);

    }
}
