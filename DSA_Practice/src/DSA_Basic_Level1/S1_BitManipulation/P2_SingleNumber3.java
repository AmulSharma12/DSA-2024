package DSA_Basic_Level1.S1_BitManipulation;
import java.util.Scanner;
//LeetCode 260  - https://leetcode.com/problems/single-number-iii/

public class P2_SingleNumber3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }


        int[] result = singleNumber(nums);
        System.out.println(result[0] + " " + result[1]);
    }


    private static int[] singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        //xor of all the number
        for(int i = 0; i<n; i++){
            xor = xor ^ nums[i];
        }

        //checking the position of set bit
        int tempPos = 0;
        int position = 0;
        while(xor != 0){
            if((xor & 1) != 0){
                position = tempPos;
                break;
            }
            tempPos++;
            xor = xor >> 1;
        }


        //now we know the position of set bit which is formed when we have two different bit at that positon
        //if we take xor for unset/set bit seprate we will get the these number in different partition
        int xorA = 0;
        int xorB = 0;
        int mask = 1 << position;
        for(int i = 0; i<n; i++){
            if((nums[i] & mask) != 0)
                xorA = xorA ^ nums[i];
            else xorB = xorB ^ nums[i];
        }


        return new int[]{xorA, xorB};
    }
}
