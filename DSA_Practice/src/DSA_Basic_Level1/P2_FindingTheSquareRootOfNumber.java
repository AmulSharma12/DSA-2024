package DSA_Basic_Level1;
import java.util.Scanner;
public class P2_FindingTheSquareRootOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(findSquareRoot(inputNum));
        System.out.println(findSquareRootUsingBinarySearch(inputNum));
    }


    //findSquareRoot - finding the square root starting from 1 to N TC - O(sqrt(N))
    // when we encounter if the number multiplying by itself will give equivalent to the entered number
    //we get the square root as SquareRoot is nothing but the number multiplied by itself gives the original number
    private static int findSquareRoot(int inputNum)
    {
        int squareRoot = -1;

        for(int number = 1; number <= inputNum; number++){
            if(number*number == inputNum)
            {
                squareRoot = number;
                break;
            }
        }


        return squareRoot;
    }



    //findSquareRootUsingBinarySearch - TC - O(logN)
    //we know that square root will lie only in the range from 1 to inputNum
    //everytime we can calculate mid (as we do in binary search) based on that value will make some decisions
    // if the mid * mid will be equal to that we get the square root
    //if mid*mid < discard the left elements - update the start to mid + 1
    //if mid* mid > discard the right elements - update the end to mid - 1
    private static int findSquareRootUsingBinarySearch(int inputNum){
        int start = 1;
        int end = inputNum;
        int squareRoot = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid == inputNum){
                squareRoot = mid;
                break;
            }
            else if(mid * mid > inputNum)
                end = mid - 1;
            else start = mid + 1;
        }


        return squareRoot;
    }
}
