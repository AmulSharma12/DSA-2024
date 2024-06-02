package DSA_Basic_Level1.BitManipulation;
import java.util.Scanner;
public class P3_SetTheIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ithBit = sc.nextInt();

        System.out.println(setIthBit(number, ithBit));
    }


    private static int setIthBit(int number , int ithBit){
        //for setting the ithbit you should always need the result bit as 1 and rest of the bit
        //should be unaffected

        //creating mask
        int mask = 1 << ithBit;
        return number | mask;
    }
}
