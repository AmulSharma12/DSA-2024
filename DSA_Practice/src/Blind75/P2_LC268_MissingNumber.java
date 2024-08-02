package Blind75;
import java.util.Arrays;
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
        System.out.println(missingNumber2(nums));
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


        //Approach 2 - using sorting and directly checcking if the element and the their position is right or not
        //TC - O(N log(n))
        //SC - O(1)

    private static int missingNumber2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int missingNumber = -1;
        for(int ind = 0; ind < n; ind++){
            if(ind != nums[ind]){
                missingNumber = ind;
                break;
            }
        }


        return missingNumber == -1 ? n : missingNumber;
    }
}
