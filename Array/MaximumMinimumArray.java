import java.util.Scanner;

public class MaximumMinimumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store five elements
        int[] numbers = new int[5];

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");

        // Read the numbers from the user and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to store the maximum and minimum elements
        int max = numbers[0];
        int min = numbers[0];

        // Iterate through the array to find the maximum and minimum elements
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the maximum and minimum elements
        System.out.println("Maximum element in array: " + max);
        System.out.println("Minimum element in array: " + min);
    }
}