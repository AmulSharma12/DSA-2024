package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
public class P4_Print_1ToN_UsingRecursion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        print1ToN(1,num);
        System.out.println("------------------");
        print1ToNUsingBacktracking(num);
    }


    private static void print1ToN(int i, int n){
        if(i > n) return;

        System.out.println(i);
        print1ToN(i+1, n);
    }

    private static void print1ToNUsingBacktracking(int n){
        if(n == 0)  return;

        print1ToNUsingBacktracking(n-1);
        System.out.println(n);
    }
}
