package Striver_Sheet.LeetCode_Problems;
import java.util.Scanner;
import java.util.Arrays;
public class P1_LC35_SearchInsertPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int target = sc.nextInt();
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("index " + searchInsert(nums,target));
    }

    private static  int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int index = -1;

        for(int i = 0; i<n; i++){
            //if element exist in the target
            if(nums[i] >= target){
                index = i;
                break;
            }
        }

        //if no element is equal or greater means all element is smaller than target
        //element so we need to return the n position
        if(index == -1) index = n;

        return index;
    }
}
