package Striver_Sheet.S4_Recursion;
import java.util.Scanner;

//LC - 125 - Valid Palindrome - https://leetcode.com/problems/valid-palindrome/
public class P1_LC_125_ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String actualString = convertString(s);
        String reversedString = new StringBuilder(actualString).reverse().toString();
        return actualString.equals(reversedString);
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
