package Striver_Sheet.S4_Recursion;
import java.util.Scanner;

//LC - 125 - Valid Palindrome - https://leetcode.com/problems/valid-palindrome/
public class P1_LC_125_ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }

    //Approach 1 - for checking string and its reverse if equal it is palindrome otherwise not
    public static boolean isPalindrome(String s) {
        String actualString = convertString(s);
        String reversedString = new StringBuilder(actualString).reverse().toString();
        return actualString.equals(reversedString);
    }

    //Approach 2 - for checking palindrome or not
    public static boolean isPalindrome2(String s) {
        String actualString = convertString(s);
        int n = actualString.length();
        int ind = 0;
        while(ind < n/2){
            if(actualString.charAt(ind) != actualString.charAt(n-ind-1))
                return false;
            ind++;
        }

        //it means all the corresponsding character equals and the loop break means all
        //the character being checked
        return true;

    }


    private static String convertString(String s){
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                if(Character.isUpperCase(ch)){
                    ch = Character.toLowerCase(ch);
                }
                result.append(ch);
            }

        }

        //now result contains the actual string
        return result.toString();
    }
}
