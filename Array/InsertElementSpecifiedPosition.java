import java.util.Scanner;

public class InsertElementSpecifiedPosition {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int index, value;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the index for insertion: ");
        index = scanner.nextInt();

        System.out.print("Enter the value to insert: ");
        value = scanner.nextInt();

        if (index >= 0 && index < 6) {
            for (int i = 5; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("Array after insertion:");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}