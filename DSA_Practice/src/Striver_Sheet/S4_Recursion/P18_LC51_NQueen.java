package Striver_Sheet.S4_Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//LeetCode 51-  NQueeen - https://leetcode.com/problems/n-queens/description/
public class P18_LC51_NQueen {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();


        List<List<String>> NQueenBoard = solveNQueens(n);
    }

    private static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();
        //dot indicate the emtpy space and Queen represent Q
        for(int i =0;i<n; i++)
            for(int j = 0; j<n; j++)
                board[i][j] = '.';

        NQueens(0, result, board,n);

        return result;
    }


    private static void NQueens(int col,List<List<String>> result, char[][] board, int n){
        //base case
        if(col == n){
            result.add(construct(board));
            return;
        }

        //recursion call
        for(int row = 0; row < n; row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                NQueens(col+1,result,board,n);
                board[row][col] = '.';
            }
        }
    }


    private static boolean isSafe(char[][] board, int rowIndex,int colIndex, int n){
        boolean isSafe = true;
        //checking for left side
        for(int row=rowIndex,col = colIndex; col >= 0; col-- )
        {
            if(board[row][col] == 'Q') return false;
        }

        for(int row=rowIndex,col=colIndex; row >=0 && col >= 0 ; row--,col--){
            if(board[row][col] == 'Q')  return false;
        }

        for(int row=rowIndex,col=colIndex; row<n && col >= 0 ; row++,col--){
            if(board[row][col]== 'Q')   return false;
        }

        return isSafe;
    }


    private static  List<String> construct(char[][] board){
        List<String> result = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
            String s = new String(board[i]);
            result.add(s);
        }

        return result;
    }
}
