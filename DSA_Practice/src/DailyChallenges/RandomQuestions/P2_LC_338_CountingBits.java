package DailyChallenges.RandomQuestions;
import java.util.Scanner;
import java.util.Arrays;
public class P2_LC_338_CountingBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] result = countBits(num);
        System.out.println(Arrays.toString(result));
    }


    public static int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int number = 0; number<n+1; number++){
            int numberOfOne = countBit(number);
            ans[number] = numberOfOne;
        }

        return ans;
    }


    private static int countBit(int number){
        int countOne = 0;
        int mask = 1;
        while(mask > 0){
            if((number & mask) != 0)   countOne++;
            mask = mask << 1;
        }


        return countOne;
    }
}
