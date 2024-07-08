package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.Arrays;

public class P8_ReverseArrayUsingRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        //taking the input from the console
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------");
        //reverse the array using recursion
        reverseArrayUsingRecursion(nums,0,size);
        System.out.println(Arrays.toString(nums));
    }

    //reverse the
    private static void reverseArrayUsingRecursion(int[] nums, int ind, int size){
        //if we reached the mid then all the elements are now swapped then time to return
        if(ind == size/2)  return;

        swap(nums,ind,size-ind-1);
        reverseArrayUsingRecursion(nums,ind+1,size);
    }

    private static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
