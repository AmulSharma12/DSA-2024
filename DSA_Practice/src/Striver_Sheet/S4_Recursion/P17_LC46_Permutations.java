package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//https://leetcode.com/problems/permutations/description/ (Leetcode - 46)
public class P17_LC46_Permutations {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] nums = new int[size];
            for(int i = 0;i<size; i++){
                nums[i] = sc.nextInt();
            }
            List<List<Integer>> permute = permute(nums);
            for(List<Integer> list: permute){
                System.out.println(list.toString());
            }
        }

    //-------------------using Approach 1
    private static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        boolean[] map = new boolean[n];
        findAllPermutations(nums,new ArrayList<>(),map, result, nums.length);
        return result;
    }


    private static void findAllPermutations(int[] nums, List<Integer> list, boolean[] map, List<List<Integer>> result, int size){
        //base case
        if(list.size() == size){
            result.add(new ArrayList<>(list));
            return;
        }

        //recursion calls
        for(int i = 0; i<size; i++){
            //if it is not visited then map & put into data structure
            if(!map[i]){
                map[i] = true;
                list.add(nums[i]);
                findAllPermutations(nums, list, map, result, size);
                list.remove(list.size()-1);
                map[i] = false;
            }
        }

    }
}
