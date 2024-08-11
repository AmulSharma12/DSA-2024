package Blind75;
import java.util.Scanner;
import java.util.Arrays;

public class P5_LC977_SquaresOfSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        sortedSquares(nums);
    }


    public static  int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int ind = 0; ind < n; ind++){
            nums[ind] = (nums[ind] * nums[ind]);
        }

        Arrays.sort(nums);
        return nums;
    }
}
