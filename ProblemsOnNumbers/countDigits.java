// Problem Statement: You are given an integer n. You need to return the number of digits in the number. 
// The number will have no leading zeroes, except when the number is 0 itself. 

package ProblemsOnNumbers;
import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int count = 0;
        
        if(input == 0){
            count = 1;
        }

        while(input != 0){
            input = input/10;
            count++;
        }

        System.out.print("There are "+ count +" number of digits.");
        sc.close();
    }
}
