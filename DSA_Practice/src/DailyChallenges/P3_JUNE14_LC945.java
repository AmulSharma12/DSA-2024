package DailyChallenges;
import java.util.Scanner;
import java.util.Arrays;
public class P3_JUNE14_LC945 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(minIncrementForUnique(nums));
    }


    private static int minIncrementForUnique(int[] nums) {
        int n = nums.length;

        //sorting the array it will make easy element arranged in the order so we dont need
        //to search when we  update if there duplicate exist because if there is duplicate it will be
        //comes as adjacent
        Arrays.sort(nums);
        int minNumberOfMoves = 0;

        for(int i = 0; i<n-1; i++){
            if(nums[i+1] <= nums[i]){
                minNumberOfMoves += Math.abs(nums[i+1]-(nums[i]+1));
                nums[i+1] = nums[i]+1;
            }
        }


        return minNumberOfMoves;
    }
}
