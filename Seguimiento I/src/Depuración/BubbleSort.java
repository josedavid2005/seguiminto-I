package Depuración;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 2, 1, 4, 7, 6};


        System.out.println("Original array:");
        printArray(numbers);


        bubbleSort(numbers);


        System.out.println("Sorted array:");
        printArray(numbers);
    }


    public static void bubbleSort(int[] array) {

        int temp;


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }
}
