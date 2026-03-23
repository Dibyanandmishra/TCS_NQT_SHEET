// You are given an integer n. You need to return the number of odd digits present in the number. 
// The number will have no leading zeroes, except when the number is 0 itself.

package ProblemsOnNumbers;
import java.util.Scanner;

public class countOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int count = 0;
        while (input !=0) {

            int digit = input % 10;

            if(digit % 2 != 0){
                count++;
            }

            input = input/10;
        }
        System.out.print("There are "+ count +" number of digits");
        sc.close();
    }
}
