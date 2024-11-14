import java.util.Scanner;

public class FindMissingElementsSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int start = 1, end = arr[4], missing;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 elements in ascending order:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Missing elements:");
        for (int i = start; i <= end; i++) {
            boolean found = false;
            for (int j = 0; j < 5; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}