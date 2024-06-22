package Striver_Sheet.S1_Basic_Math_Problem;
import java.util.Scanner;
import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/count-digits5716/1  (GFG)
public class P4_GFG_CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(evenlyDivides(number));
    }


    //GFG - countDigits problem
    private static int evenlyDivides(int N){
        // code here
        int number = N;
        int count = 0;

        while(number > 0){
            int digit = number % 10;
            if(digit != 0(N%digit) == 0)  count++;
            number /= 10;
        }
        return count;
    }
}
