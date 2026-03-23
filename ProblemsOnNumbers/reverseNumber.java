// You are given an integer n. Return the integer formed by placing the digits of n in the reverse order. 

package ProblemsOnNumbers;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int revNum = 0;

        while(num != 0){
            int remainder = num % 10; 
            revNum = revNum * 10 + remainder;
            num = num/10;
        }
        System.out.print("The reversed number is: " + revNum);
        sc.close();
    }
}
