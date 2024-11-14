import java.util.Scanner;

public class SumElementsArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}