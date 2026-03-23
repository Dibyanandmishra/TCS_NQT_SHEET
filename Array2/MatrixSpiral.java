// Given an M*N matrix, print the elements in a clockwise spiral manner. 

package Array2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixSpiral {
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.println("Spiral Order: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Take matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printSpiral(matrix, rows, cols);

        sc.close();
    }
}