package LeetCode_Study_Plan.S1_BinarySearch;
import java.util.Scanner;

public class P1_LC_BinarySearch {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] nums = new int[size];

    for(int i = 0; i<size; i++){
        nums[i] = sc.nextInt();
    }


    int target = sc.nextInt();

    System.out.println(search(nums,target));
}

    private static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int index = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                index = mid;
                break;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }


        return index;
    }

}
