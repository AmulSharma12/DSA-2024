package Striver_Sheet.LeetCode_Problems;
import java.util.Scanner;
import java.util.Arrays;

//LC 34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class P2_LC34_FirstAndLastOccurenceInSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        //taking input for the array nums
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //taking target from the input
        int target = sc.nextInt();

        //printing the nums array
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }


    //Approach 1 - using linearaly searching from both the ends
    private static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int firstOccurence = -1;
        int secondOccurence = -1;

        while(start <= n-1){
            if(nums[start] == target)   {
                firstOccurence = start;
                break;
            }
            start ++;
        }

        while(end >= 0){
            if(nums[end] == target){
                secondOccurence = end;
                break;
            }

            end--;
        }

        return new int[] {firstOccurence,secondOccurence};
    }
}
