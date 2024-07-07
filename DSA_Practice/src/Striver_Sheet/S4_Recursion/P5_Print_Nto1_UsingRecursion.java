package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
public class P5_Print_Nto1_UsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNto1(5);
        System.out.println("-----------------");
        printNTo1UsingBacktracking(1,5);
    }


    private static void printNto1(int n){
        if(n == 0)  return;
        System.out.println(n);
        printNto1(n-1);
    }


    private static void printNTo1UsingBacktracking(int i, int n){
        if(i > n)   return;
        printNTo1UsingBacktracking(i+1,n);
        System.out.println(i);
    }
}
