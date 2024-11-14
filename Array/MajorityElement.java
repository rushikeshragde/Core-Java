import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int majorityIndex = 0;
        int countMajority = 1;

        for (int i = 1; i < n; i++) {
            if (arr[majorityIndex] == arr[i]) {
                countMajority++;
            } else {
                countMajority--;
            }

            if (countMajority == 0) {
                majorityIndex = i;
                countMajority = 1;
            }
        }

        boolean isMajority = false;
        countMajority = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[majorityIndex]) {
                countMajority++;
            }
        }

        if (countMajority > n / 2) {
            System.out.println("The majority element is: " + arr[majorityIndex]);
            isMajority = true;
        }

        if (!isMajority) {
            System.out.println("There are no Majority Elements in the given array.");
        }
    }
}