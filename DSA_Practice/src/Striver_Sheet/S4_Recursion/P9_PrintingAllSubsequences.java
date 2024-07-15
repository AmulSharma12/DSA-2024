package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//printing all the subsequences for the array
public class P9_PrintingAllSubsequences {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        //creating the array of size
        int[] nums = new int[size];

        //taking the input from the array
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        //recursion call for printing all the subsequences
        printingAllSubsequences(0,new ArrayList<Integer>(), nums,size);
    }


    private static void printingAllSubsequences(int ind, List<Integer> ds,int[] nums,int n){
        //base case - if not include the empty subsequence then check with the condition whether your ds size is 0 or not
        //if ds size is 0 means it is empty subsequnce otherwise the subsequence has some elements
        if(ind == n){
            if(ds.size() == 0)  return;
            System.out.println(ds);
            return;
        }

        //recursion calls
        ds.add(nums[ind]);
        printingAllSubsequences(ind+1, ds,nums, n);
        ds.remove(ds.size()-1);

        printingAllSubsequences(ind+1,ds,nums,n);
    }
}
