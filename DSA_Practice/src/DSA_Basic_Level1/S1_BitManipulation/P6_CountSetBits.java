package DSA_Basic_Level1.S1_BitManipulation;
import java.util.Scanner;
public class P6_CountSetBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(countSetBit(number));
    }


    //counting the set bits in the number using mask
    private static int countSetBit(int number){
        int mask = 1;
        int numberOfSetBit = 0;
        while(mask != 0){
            if((number&mask) != 0)  numberOfSetBit++;
            mask = mask << 1;
        }


        return numberOfSetBit;
    }
}
