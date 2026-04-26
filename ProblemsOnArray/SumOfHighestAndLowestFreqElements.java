// Given an array of n integers, find the sum of the frequencies of the highest occurring and lowest occurring number.

package ProblemsOnArray;

import java.util.*;

public class SumOfHighestAndLowestFreqElements {

    public static int SumFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        int maxEle = 0;
        int minEle = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("Highest frequency Element = " + maxEle +", Lowest frequency Element = " + minEle);

        return maxEle + minEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "Sum of highest and lowest frequencies = " + SumFreq(arr));

        sc.close();
    }
}
