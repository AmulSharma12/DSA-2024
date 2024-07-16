package Striver_Sheet.S5_ArrayBasic;
import java.util.Scanner;

//Leet Code 1752 - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class P1_LC_1752_Check_If_Array_Is_Sorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(check(nums));
    }



        private static boolean check(int[] nums) {
            int n = nums.length;
            int cnt = 0;
            for(int i = 0; i<n-1; i++){
                if(nums[i] > nums[i+1]) cnt++;
            }

            boolean isValid = false;
            if(cnt == 0)    isValid = true;
            if(cnt == 1 && nums[0] >= nums[n-1])     isValid = true;
            return isValid;
        }


}
