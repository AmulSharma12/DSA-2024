package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
public class P3_Print_NTimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNameNTime(1,num);
    }


    private static void printNameNTime(int i, int n){
        if(i > n)   return;
        System.out.println("name");
        printNameNTime(i+1,n);

    }

}
