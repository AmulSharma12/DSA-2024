package DailyChallenges;
import java.util.Arrays;
import java.util.Scanner;
public class P2_JUNE13_LC2037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] seats = new int[size];
        int[] students = new int[size];

        for(int i = 0; i<size; i++){
            seats[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            students[i] = sc.nextInt();
        }

        //calling the function
        //Minimum number of moves to seat everyone
        int minMoves = minMovesToSeat(seats,students);
        System.out.println(minMoves);
    }


    //
    private static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        //to move the student to that number of seat we will need the minimum possible
        //position shift
        int minNumberOfMoves = 0;
        int n = seats.length;
        for(int pos = 0; pos < n; pos++){
            minNumberOfMoves += Math.abs(seats[pos] - students[pos]);
        }

        return minNumberOfMoves;
    }
}
