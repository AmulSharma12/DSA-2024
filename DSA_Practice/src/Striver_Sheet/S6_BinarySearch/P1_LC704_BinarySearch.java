package Striver_Sheet.S6_BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class P1_LC704_BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        int target = sc.nextInt();
        System.out.println(search(nums,target));
    }


    public static int search(int[] nums, int target) {
        int n = nums.length;
        int startInd = 0;
        int endInd = n-1;
        int resultInd = -1;

        while(startInd <= endInd){
            int mid = startInd + (endInd - startInd)/2;
            if(nums[mid] == target){
                resultInd = mid;
                break;
            }
            else if(target > nums[mid]){
                startInd = mid + 1;
            }else{
                endInd = mid - 1;
            }
        }

        return resultInd;
    }
}
