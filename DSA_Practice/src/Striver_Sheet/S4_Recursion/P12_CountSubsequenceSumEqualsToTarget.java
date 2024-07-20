package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//printing single subsequence whose sum equals sum to the target
//NOTE one point you can't print the specific subsequence you can avoid future recursion calls that's how you can print
//only the single subsequence
public class P12_CountSubsequenceSumEqualsToTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //taking input for the target
        int target = sc.nextInt();

        //function call to count the number of subsequences that are equals to the target
        int numberOfSubsequence = countSubsequencesSumEqualsToTarget(0,0, target, nums, nums.length);
        System.out.println("number of subsequences " + numberOfSubsequence);
    }

    //counting the number of subsequences whose sum equals to the target
    private static int countSubsequencesSumEqualsToTarget(int index, int sum, int target, int[] nums, int n){
        if(sum > target)    return 0;
        //base case
        if(index == n){
            if(sum == target)   return 1;
            return 0;
        }

        //recursion calls
        //take case
        sum += nums[index];
        int l = countSubsequencesSumEqualsToTarget(index+1,sum, target, nums,n);
        sum -= nums[index];


        //not take case
        int r = countSubsequencesSumEqualsToTarget(index+1,sum, target, nums,n);

        return l + r;
    }
}

