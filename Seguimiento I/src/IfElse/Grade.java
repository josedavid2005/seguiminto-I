package IfElse;

public class Grade {
    public static void main(String[] args) {
        double grade1 = 8.5;
        double grade2 = 7.0;
        double grade3 = 9.0;
        double average = (grade1 + grade2 + grade3) / 3;
        if (average >= 9.5) {
            System.out.println("The grade is A.");
        } else if (average >= 8.5) {
            System.out.println("The grade is B.");
        } else if (average >= 7.5) {
            System.out.println("The grade is C.");
        } else if (average >= 6.5) {
            System.out.println("The grade is D.");
        } else {
            System.out.println("The grade is E.");
        }

    }
}
