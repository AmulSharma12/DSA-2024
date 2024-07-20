package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//printing single subsequence whose sum equals sum to the target
//NOTE one point you can't print the specific subsequence you can avoid future recursion calls that's how you can print
//only the single subsequence
public class P11_PrintSingleSubsequenceEqualsToTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }


        //taking input for the target
        int target = sc.nextInt();

        //function call to print the single subsequence whose sum equals to the target
        printSingleSubsequenceSumEqualsToTarget(0,new ArrayList<>(), 0, target, nums, nums.length);

    }

    private static boolean printSingleSubsequenceSumEqualsToTarget(int index, List<Integer> list, int sum, int target, int[] nums, int n){
        if(sum > target)    return false;
        //base case
        if(index == n){
            if(sum == target){
                    System.out.println(list.toString());
                    return true;
            }
            return false;
        }

        //recursion calls
        //take case - if we get the subsequence then return true from there only
        list.add(nums[index]);
        sum += nums[index];
        if(printSingleSubsequenceSumEqualsToTarget(index+1,list,sum, target, nums,n))   return true;
        list.remove(list.size()-1);
        sum -= nums[index];


        //not take case - if we get subsequence then return true from there only
        if(printSingleSubsequenceSumEqualsToTarget(index+1,list,sum, target, nums,n))   return true;

        //in case if we found no subsequence for both take and not take case then return false
        return false;
    }
}

