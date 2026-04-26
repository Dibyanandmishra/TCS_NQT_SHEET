// Remove duplicates from an unsorted array.

package ProblemsOnArray;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDupliUnsorted {

    public static void removeDuplicates(int[] arr) {
        int index = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);

        sc.close();
    }
}
