import java.util.Scanner;

public class MaxiMiniElementsArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max, min;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        arr[0] = scanner.nextInt();
        max = min = arr[0];

        for (int i = 1; i < 5; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}