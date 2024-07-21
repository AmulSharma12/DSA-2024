package Striver_Sheet.S4_Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//Leetcode 78 - Subsets - https://leetcode.com/problems/subsets/
public class P15_LC78_Subsets {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int[] nums = new int[size];
         for(int i = 0; i<size; i++){
             nums[i] = sc.nextInt();
         }


         //calling the method for finding all the subsets for the existing nums array containing unique elements
         List<List<Integer>> subsets = subsets(nums);

         //printing all the subsets
         for(List<Integer> subset: subsets){
             System.out.println(subset.toString());
         }
     }

    private static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        findAllSubsets(0, new ArrayList<>(), result, nums, n);
        return result;
    }


    private static void findAllSubsets(int index, List<Integer> list, List<List<Integer>> result, int[] nums, int n){
        //base case
        if(index == n){
            result.add(new ArrayList<>(list));
            return;
        }

        //not pick call
        findAllSubsets(index+1, list, result, nums, n);

        //pick call
        list.add(nums[index]);
        findAllSubsets(index+1, list, result, nums, n);
        list.remove(list.size()-1);
    }
}
