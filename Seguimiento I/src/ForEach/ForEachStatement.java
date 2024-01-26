package ForEach;

public class ForEachStatement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("The sum of the numbers is: " + sum);

    }
}
