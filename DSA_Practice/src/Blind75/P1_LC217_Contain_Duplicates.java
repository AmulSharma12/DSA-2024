package Blind75;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class P1_LC217_Contain_Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(nums));
        System.out.println("------------------");
        System.out.println(containsDuplicate2(nums));
    }


    // Approach 1 - using naive solution
    private static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        //take element and check in complete array if exists their occurence then just return true
        boolean isDuplicateExist = false;
        for(int ind = 0; ind < n-1; ind++ ){
            for(int currInd = ind+1; currInd < n; currInd++){
                if(nums[ind] == nums[currInd])  {
                    isDuplicateExist = true;
                    break;
                }
            }

            if(isDuplicateExist)    break;
        }
        return isDuplicateExist;
    }



        // Approach 2
        // using set -> if all unique element is there then they are include in set and if it is equal to length of array means all      //are unique return false otherwise true
        private static boolean containsDuplicate2(int[] nums) {
            int n = nums.length;
            Set<Integer> set = new HashSet<Integer>();

            for(int i = 0; i<n; i++)
            {
                set.add(nums[i]);
            }

            int setLength = set.size();

            if(setLength == n)
                return false;
            return true;
        }

}
