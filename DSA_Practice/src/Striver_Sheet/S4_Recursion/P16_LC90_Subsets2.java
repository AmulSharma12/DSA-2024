package Striver_Sheet.S4_Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P16_LC90_Subsets2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0;i<size; i++){
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = subsetsWithDup(nums);
        for(List<Integer> list : result){
            System.out.println(list.toString());
        }
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        //we are sorting so that we can skip while recursion call as after sorting the duplicates will be sidebyside position
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        subset2(0,new ArrayList<>(), result, nums, n);
        return result;
    }


    private static void subset2(int index, List<Integer> list, List<List<Integer>> result, int[] nums, int n)
    {
        //At every recursion call adding into result
        result.add(new ArrayList<>(list));

        //for every index recursion call -looping from i = index to n-1
        for(int i = index; i<n; i++)
        {
            if(i > index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            subset2(i+1, list, result, nums, n);
            list.remove(list.size()-1);
        }
    }
}
