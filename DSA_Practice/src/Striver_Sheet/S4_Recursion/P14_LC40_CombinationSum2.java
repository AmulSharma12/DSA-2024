package Striver_Sheet.S4_Recursion;
import java.util.*;

//LEETCODE - 40 - combination sum2  problem - https://leetcode.com/problems/combination-sum-ii/

public class P14_LC40_CombinationSum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();


        //making function call for the combinationSum2 method
        List<List<Integer>> result = combinationSum2(nums, target);
        for(List<Integer> list: result){
            System.out.println(list);
        }
    }

    //combinationSum2
    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        uniqueCombinationSum2(0, new ArrayList<>(), result,candidates, n, target);
        return result;
    }

    private static void uniqueCombinationSum2(int ind, List<Integer> list, List<List<Integer>> result, int[] nums, int n,int target){
        //base case
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }

        //logic looping from i = ind -> n-1
        for(int i = ind; i<n; i++){
            //skip the duplicate only if it is not the very first element
            if(i > ind && nums[i] == nums[i-1]) continue;
            if(nums[i] > target)     break;

            list.add(nums[i]);
            uniqueCombinationSum2(i+1, list, result,nums, n, target-nums[i]);
            list.remove(list.size()-1);

        }
    }
}
