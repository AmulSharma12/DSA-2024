package Blind75;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class P3_LC448_FindMissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findDisappearedNumbers(nums).toString());
        System.out.println("0-----------------------");
//        System.out.println(missingNumber2(nums));
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] map = new boolean[n];

        //now traversing over the nums to mark in map true/false existence
        //we have mapped element(nums[i] - [1..n]) to the map indexes[0...n-1]
        for(int element: nums){
            map[element-1] = true;
        }

        List<Integer> missingElement = new ArrayList<>();
        //now traversing over the map to find out list of missing element
        //if map contains false then there is missing element that will be ind+1
        for(int ind = 0; ind<n; ind++){
            if(!map[ind]){
                missingElement.add(ind+1);
            }
        }


        return missingElement;
    }
}
