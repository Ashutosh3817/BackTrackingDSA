package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;
import java.util.Collections;

public class NQueenProblemGFG {
	static void helper(int[][] board,ArrayList<ArrayList<Integer>> allBoards,int col){
        if(col==board.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<board.length;i++) {
                for(int j=0;j<board.length;j++) {
                    if(board[i][j]==1) list.add(j+1);
                }
            }
            allBoards.add(new ArrayList<>(list));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 1;
                helper(board,allBoards,col+1);
                board[row][col] = 0;
            }
        }
    }
    
    public static boolean isSafe(int row,int col,int[][] board){
        //horizomtal
        for(int j=0;j<board.length;j++){
            if(board[row][j]==1){
                return false;
            }
        }
        for(int j=0;j<board[0].length;j++){
            if(board[j][col] ==1){
                return false;
            }
        }
        int r=row;
        //upper letf
        for(int c = col;r>=0 && c>=0;r--,c--){
            if(board[r][c] == 1){
                return false;
            }
        }
        //upper right
        r=row;
        for(int c=col;r>=0 && c<board.length;c++,r--){
            if(board[r][c] == 1){
                return false;
            }
        }
        //down left
         r=row;
        for(int c=col;r<board.length && c>=0 ;r++,c--){
            if(board[r][c]==1){
                return false;
            }
        }
        //down right
         r = row;
        for(int c = col;r<board.length && c<board.length;r++,c++){
            if(board[r][c]==1){
                return false;
            }
        }
        return true;
    }
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> allBoards = new ArrayList<>();
        int[][] board = new int[n][n];
        helper(board,allBoards,0);
        Collections.reverse(allBoards);
        return allBoards;
    }
    public static void main(String[] args) {
    	int n=4;
    	System.out.println(nQueen(4));
    }
}
