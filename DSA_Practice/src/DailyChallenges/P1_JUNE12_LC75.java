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
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }


    //Approach 1- using direct inbuilt function
    public static void sortColors1(int[] nums) {
       Arrays.sort(nums);
    }


    public static void sortColors2(int[] nums) {
        int n = nums.length;
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 0)    count_0++;
            else if(nums[i] == 1)   count_1++;
            else count_2++;
        }

        int ind = 0;
        while(count_0-- > 0)    nums[ind++] = 0;
        while(count_1-- > 0)    nums[ind++] = 1;
        while(count_2-- > 0)    nums[ind++] = 2;
    }
}
