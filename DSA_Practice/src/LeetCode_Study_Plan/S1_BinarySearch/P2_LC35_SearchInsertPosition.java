package LeetCode_Study_Plan.S1_BinarySearch;

import java.util.Scanner;

public class P2_LC35_SearchInsertPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }

    //Approach 1 - using naive traversal - O(N)`
    private static int searchInsert(int[] nums, int target) {
        int index = -1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] >= target)   {
                index = i;
                break;
            }
        }
        return index == -1?n : index;
    }

    //Approach 2 - using binary Search - O(N)
    private static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int expectedIndex = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                expectedIndex = mid;
                break;
            }

            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return expectedIndex == -1 ? start : expectedIndex;
    }
}
