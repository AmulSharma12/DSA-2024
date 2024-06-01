package DSA_Basic_Level1.BitManipulation;
import java.util.Scanner;

public class P2_CheckithBitSetOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ithBit = sc.nextInt();
        System.out.println(checkIthBitSetOrNot(num, ithBit));
    }


    private static boolean checkIthBitSetOrNot(int num, int ithBit){

        //checking ith bit set or not by moving num to the LSB & by doing and by 1 if 0 => 0 if 1 => 1
        return ((num >> ithBit) & 1) != 0;


        //we can also move LSB (1) to the ith Bit by left shifting it to the ithBit
//        System.out.println(Integer.toBinaryString(num) + " " + ithBit + " "  + Integer.toBinaryString(1 << ithBit));
//        return (num & (1 << ithBit)) != 0;
    }
}
