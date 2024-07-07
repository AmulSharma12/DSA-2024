package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
public class P6_PrintSumOfNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfNNaturalNumber(num, 0);
        System.out.println("-------------");
        System.out.println(sumOfNNaturalNumber2(num));
    }

    //Parameterised way - parameter contains the answer
    private static void sumOfNNaturalNumber(int i, int sum){
        if(i < 1)   {
            System.out.println(sum);
            return;
        }

        sumOfNNaturalNumber(i-1, sum + i);
    }


    //functional recursion - function will return the answer
    private static int sumOfNNaturalNumber2(int n){
        if(n == 0)      return 0;
        return n + sumOfNNaturalNumber2(n-1);
    }
}
