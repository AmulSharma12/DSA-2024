package Striver_Sheet.S1_Basic_Math_Problem;
import java.util.Scanner;

//https://leetcode.com/problems/palindrome-number/  LeetCode - 9 Palindrome number
public class P2_LC9_PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPalindrome(number));
        System.out.println(isPalindrome2(number));
    }


    // Approach 1 - Using StringBuilder reverse method in java
    private static boolean isPalindrome(int x) {
        //for negative value the number should not be palindrome
        if(x < 0)   return false;

        //for positive value - convert into string to reverse and compare it with the original number
        String number = Integer.toString(x);
        StringBuilder numberReversed = new StringBuilder(number).reverse();
        return number.equals(numberReversed.toString());
    }

    //Approach 2 - by making reverse using the number
    private static boolean isPalindrome2(int x) {
        //for negative values palindrome cant be make
        if(x < 0)   return false;

        //for positive values converting into the reverse and then compairing to the original number
        int number = x;
        int reversed = 0;


        while(number !=0){
            //getting digit
            int digit = number%10;
            //make the reverse using that digit
            reversed = (reversed * 10) + digit;

            //multiplier should be move to by ten-ten place and
            //number reduce to get the last digit every time

            number/=10;
        }

        System.out.println(x + " " + reversed);
        return x == reversed;
    }
}
