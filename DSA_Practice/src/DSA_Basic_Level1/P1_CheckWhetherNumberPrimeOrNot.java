package DSA_Basic_Level1;
import java.util.Scanner;

public class P1_CheckWhetherNumberPrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = isPrimeOrNot(number);
        boolean isPrime1 = isPrimeOrNotOptimised(number);

        if(isPrime || isPrime1)
        {
            System.out.println(isPrime + " " + isPrime1 + " " + number + " is prime" );

        }else{
            System.out.println("not a prime number");
        }
    }

    //isPrimeOrNot same method
    private static boolean isPrimeOrNot(int N){
        int noOfFactor = 0;

        //Checking from 1 to that number for getting the exact total number of factors divisible by N
        for(int i = 1; i<=N; i++){
            if(N%i == 0)    noOfFactor++;
        }

        //from 1 to N if we get two counter that means two factor which is divisible by N it means
        //Number N is prime otherwise it is not
        return noOfFactor == 2;
    }

    //same method but in less no iterations O(logN)
    private static boolean isPrimeOrNotOptimised(int N){
        boolean isPrime = true;

        //starting from 2 if we don't get any factor till root of N it means it is prime or not
        //why we are checking till root of N because after that the same pair of numbers
        //will be repeated so no need to check the same pair again if already checked.
        for(int i = 2; i*i<=N; i++){
            if(N%i == 0){
                isPrime = false;
                break;
            }
        }

        //from 1 to N if we get two counter that means two factor which is divisble by N it means
        //Number N is prime otherwise it is not
        return isPrime;
    }
}