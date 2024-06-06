package DSA_Basic_Level1.BitManipulation;
import java.util.Scanner;
public class P4_ToggleTheIthBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ithBit = sc.nextInt();

        System.out.println(toggleIthBit(number, ithBit));
    }


    private static int toggleIthBit(int number, int ithBit){
        //creating mask for toggling we can use xor bitwise operator
        //if there is 0/1 ^ 1 = 1/0 make sure the rest bit will be unaffected
        //0/1 ^ 0 = 0/1
        int mask = 1 << ithBit;
        return number ^ mask;
    }
}
