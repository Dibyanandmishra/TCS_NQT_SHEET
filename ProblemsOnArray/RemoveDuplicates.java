// Remove duplicates from a sorted array

package ProblemsOnArray;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
