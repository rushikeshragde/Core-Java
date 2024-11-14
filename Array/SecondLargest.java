import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n < 2) {
            System.out.println("Array must have at least two elements!");
        } else {
            int largest = arr[0];
            int secondLargest = arr[0];

            for (int i = 1; i < n; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            System.out.println("The Second largest element in the array is: " + secondLargest);
        }
    }
}