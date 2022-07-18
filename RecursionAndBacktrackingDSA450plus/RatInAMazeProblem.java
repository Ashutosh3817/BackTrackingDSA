package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;

public class RatInAMazeProblem {
	static ArrayList<String> findPath(int[][] m ,int n ){
		ArrayList<String> paths = new ArrayList<>();
		findAllPathsInMaze(m,0,0,paths,"");
		return paths;
	}
	static void findAllPathsInMaze(int[][] maze,int i,int j,ArrayList<String> paths,String path) {
		if(i<0 || j<0 || i>maze.length-1 || j>maze[0].length-1 || maze[i][j]==0) return ;
		
		if(i==maze.length-1 && j==maze[0].length-1) paths.add(path);
		
		maze[i][j]=0;
		findAllPathsInMaze(maze,i+1,j,paths,path+"D");
		findAllPathsInMaze(maze,i,j-1,paths,path+"L");
		findAllPathsInMaze(maze,i,j+1,paths,path+"R");
		findAllPathsInMaze(maze,i-1,j,paths,path+"U");
		maze[i][j]=1;
	}
	public static void main(String[] args) {
		int[][] m = {{1,0,0,0},
		             {1,1,0,1},
		             {1,1,0,0},
		             {0,1,1,1}};
		int n = 4;
		System.out.println(findPath(m,n));
}
}
