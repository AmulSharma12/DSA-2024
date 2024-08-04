package Blind75;
import java.util.Scanner;

public class P4_LC136_SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(singleNumber(nums));
    }


    //Approach 1 - Using naive approach - by checking the specific elemnt occurence in the array on other index
    //O(N^2)
    private static int singleNumber(int[] nums) {
        int n = nums.length;
        int singleNumber = 0;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j<n; j++){
                if(i!=j && nums[i] == nums[j]){
                    cnt++;
                    break;
                }
            }

            if(cnt == 0){
                singleNumber = nums[i];
            }
        }
        return singleNumber;
    }

}
