package DailyChallenges;
import java.util.*;

//LeetCode 75 - Sort Colors
//https://leetcode.com/problems/sort-colors/
public class P1_JUNE12_LC75 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        //taking input one by one for array
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        sortColors1(nums);
        System.out.println(Arrays.toString(nums));
    }


    //Approach 1- using direct inbuilt function
    public static void sortColors1(int[] nums) {
       Arrays.sort(nums);
    }
}
