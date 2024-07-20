package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P10_PrintAllSubsequenceEqualsToTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size ; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        printAllSubsequenceEqualsToTarget(0, new ArrayList<>(), 0, nums, target);
    }


    //printing all the subsequences whose sum equals to the target
    private static void printAllSubsequenceEqualsToTarget(int index, List<Integer> list, int sum, int[] nums, int target){
        //base case
        //if(sum > target)    return;
        if(index == nums.length){
            if(sum == target){
                System.out.println(list.toString());
            }
            return;
        }

        //recursion calls
        list.add(nums[index]);
        sum += nums[index];
        printAllSubsequenceEqualsToTarget(index + 1, list, sum, nums, target);
        list.remove(list.size()-1);
        sum -= nums[index];

        printAllSubsequenceEqualsToTarget(index+1, list, sum, nums, target);
    }
}
