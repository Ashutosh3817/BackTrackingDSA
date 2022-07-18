package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;

public class Nqueen {
	 static ArrayList<ArrayList<Integer>> queen(int n){
		ArrayList<ArrayList<Integer>> allBoards = new ArrayList<>();
		int[][] board = new int[n][n];
		helper(board,allBoards,0);
		return allBoards;
	}
	public static void helper(int[][] board,ArrayList<ArrayList<Integer>> allBoards,int col) {
		if(col == board.length) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<board.length;i++) {		
			for(int j=0;j<board.length;j++) {
				if(board[i][j]==1) list.add(j+1);
			}
			}
			allBoards.add(new ArrayList<> (list) );
			return;
			}
			for(int row=0;row<board.length;row++) {
				if(isSafe(row,col,board)) {
					board[row][col]=1;
					helper(board,allBoards,col+1);
					board[row][col] = 0 ;
				}
			}
	}
	public static boolean isSafe(int row,int col,int[][] board) {
		//for column
		for(int i=0;i<board.length;i++) {
			if(board[row][i]==1) return false;
		}
		//for row
		for(int i=0;i<board[0].length;i++) {
			if(board[i][col]==1) return false;
		}
		//upper left
		int r=row;
		for(int c=col;r>=0 && c>=0;r--,c--) {
			if(board[r][c]==1) return false;
		}
		//upper right
				r=row;
				for(int c=col;r>=0 && c<board.length;r--,c++) {
					if(board[r][c]==1) return false;
				}
				//down left
				 r=row;
				for(int c=col;r<board.length && c>=0;r++,c--) {
					if(board[r][c]==1) return false;
				}
				//down right
				r=row;
				for(int c=col;r<board.length && c<board.length;r++,c++) {
					if(board[r][c]==1) return false;
				}
		return true;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(queen(n));
	}
}
