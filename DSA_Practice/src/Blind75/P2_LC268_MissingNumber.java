package Blind75;
import java.util.Scanner;

public class P2_LC268_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(missingNumber(nums));
        System.out.println("0-----------------------");
    }

        //Approach 1 - using naive solution by taking extra space for tracking
        private static int missingNumber(int[] nums) {
            int n = nums.length;
            boolean map[] = new boolean[n+1];

            for(int element : nums){
                map[element] = true;
            }

            int missingElement = -1;
            for(int ind = 0; ind < n+1; ind++){
                if(!map[ind]){
                    missingElement = ind;
                    break;
                }
            }
           return missingElement;

        }
}
