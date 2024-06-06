package DSA_Basic_Level1.BitManipulation;
import java.util.Scanner;
public class P5_UnsetTheIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ithBit = sc.nextInt();
        System.out.println(unsetTheIthBit(number, ithBit));
    }


    private static int unsetTheIthBit(int number, int ithBit){
        //we know by and with 0 we always get 0 0/1 & 0 = 0/0  but the remaining bit will
        //0/1 = 0/0   it is not preserved the remaining bit so we just need to make th ith bit set to 0
        //rest will be unaffected


        //now we will move the 1 to ith position  - then we do negation it becomes 0 rest becomes 1
        //now we do & with mask   0/1 & 0 => 0 unset the bit
        //remaining bit unaffected   0/1 & 1 => 0/1
        int mask = ~(1 << ithBit);
        return number & mask;
    }
}
