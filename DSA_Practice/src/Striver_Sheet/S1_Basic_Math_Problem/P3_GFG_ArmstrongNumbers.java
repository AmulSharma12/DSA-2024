package Striver_Sheet.S1_Basic_Math_Problem;
import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class P3_GFG_ArmstrongNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(armstrongNumber(number));
    }


    //checking whether the number is armstrong or not
    private static String armstrongNumber(int n) {
        // code here
        int number = n;
        int armstrongNumber = 0;
        while(number > 0){
            int digit = number%10;
            armstrongNumber += digit * digit * digit;
            number /= 10;
        }


        return n == armstrongNumber ? "true" : "false";
    }
}
