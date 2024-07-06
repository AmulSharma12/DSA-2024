package Striver_Sheet.S4_Recursion;
import java.util.Scanner;

public class P2_LC_509_FibbonaciNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nthFibbonaci = sc.nextInt();
        System.out.println(fib(nthFibbonaci));
    }

    //Approach 1- using two pointer variables (naive)
    public static int fib(int n) {
        if(n == 0 || n == 1)
            return n;
        int prev = 0;
        int curr = 1;

        //starting from 2 till the nth fibbonaci
        for(int i = 2; i<=n; i++){
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }

        //curr pointer variable will point to the updated nth fibbonaci number
        return curr;
    }
}
