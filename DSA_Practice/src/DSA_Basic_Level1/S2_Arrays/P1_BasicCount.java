package DSA_Basic_Level1.S2_Arrays;
import java.util.Scanner;
public class P1_BasicCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {-2,3,4,5,6,8,8};
        int maxElement = Integer.MIN_VALUE;
        for(int element:arr){
            if(element > maxElement)
                maxElement = element;
        }

        //count of the only element which have atleast one element greater than themseleves
        int countOfElement = 0;
        for(int element:arr){
            if(element != maxElement)
                countOfElement++;
        }

        //countOfElement - counting the number of element
        System.out.println(countOfElement);
    }
}
