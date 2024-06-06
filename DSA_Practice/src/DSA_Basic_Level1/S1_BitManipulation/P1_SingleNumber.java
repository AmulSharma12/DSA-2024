package DSA_Basic_Level1.BitManipulation;
import java.util.Scanner;

public class P1_SingleNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        singleNumber(nums);
    }


    //singleNumber using - Bit manipulation
    private static int singleNumber(int[] nums) {
        int n = nums.length;
        int singleNumber = 0;

        for(int element : nums){
            singleNumber ^= element;
        }
        return singleNumber;
    }
}
