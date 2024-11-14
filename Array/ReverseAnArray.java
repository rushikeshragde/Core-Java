import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        // Swap elements from both ends
        for (int i = 0; i < 5 / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[5 - i - 1];
            arr[5 - i - 1] = temp;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}