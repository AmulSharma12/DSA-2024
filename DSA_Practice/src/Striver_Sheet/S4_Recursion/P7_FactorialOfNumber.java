package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
public class P7_FactorialOfNumber {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num,1);
        System.out.println("-------------------------");
        System.out.println(factorial2(num));
    }

    //Parameterised way - parameter will contains the answer
    private static void factorial(int num, int fact){
        if(num == 0)   {
            System.out.println(fact);
            return;
        }
        factorial(num-1, fact*num);
    }

    //functional way - function will return the factorial of answer
    private static int factorial2(int num){
        if(num == 0)    return 1;
        return num * factorial2(num-1);
    }
}
