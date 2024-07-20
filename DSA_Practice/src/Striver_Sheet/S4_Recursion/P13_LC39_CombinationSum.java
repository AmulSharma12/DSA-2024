package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class P13_LC39_CombinationSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //taking input to target
        int target = sc.nextInt();

        List<List<Integer>> result = combinationSum(nums,target);
        for(List<Integer> list : result){
            System.out.println(list.toString());
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
        uniqueCombinations(0, new ArrayList<>(), result, 0, target, candidates, candidates.length);
        return result;
    }


    private static void uniqueCombinations(int ind, List<Integer> list, List<List<Integer>> result, int sum, int target, int[] nums, int n){
        if(sum > target)    return;
        if(ind == n){
            if(sum == target){
                result.add(new ArrayList<>(list));
            }
            return;
        }


        //not take call
        uniqueCombinations(ind+1, list, result, sum, target, nums,n);

        //take call
        sum += nums[ind];
        list.add(nums[ind]);
        uniqueCombinations(ind, list, result, sum, target, nums, n);
        list.remove(list.size()-1);
        sum -= nums[ind];
    }
}
