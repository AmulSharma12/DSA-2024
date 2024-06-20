package Striver_Sheet.S1_Basic_Math_Problem;
import java.util.Scanner;
import java.util.Arrays;

//LeetCode 7 - Reverse Integer
public class P1_ReverseInteger {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(reverse(number));
    }

    //Approach 1 - using StringBuilder reverse method directly
    private static int reverse(int x) {
        boolean isNegativeValue = false;
        if(x < 0){
            x = x * -1;
            isNegativeValue = true;
        }

        //now the number is positive convert it into the string
        StringBuilder number = new StringBuilder();
        String str = Integer.toString(x);
        number.append(str);
        number.reverse();
        int reversed = 0;
        try{
            reversed = Integer.valueOf(number.toString());
        }catch(Exception e){
            return reversed;
        }
        if(isNegativeValue) reversed = reversed * -1;

        return reversed;
    }
}
