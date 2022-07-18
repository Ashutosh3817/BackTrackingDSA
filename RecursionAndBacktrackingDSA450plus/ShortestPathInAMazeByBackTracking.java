package RecursionAndBacktrackingDSA450plus;

public class ShortestPathInAMazeByBackTracking {
	public static void main(String[] args) {
		int a[][] =
			{
					{1,1,1,1,1,0,0,1,1,1},
					{0,1,1,1,1,1,0,1,0,1},
					{0,0,1,0,1,1,1,0,0,1},
					{1,0,1,1,1,0,1,1,0,1},
					{0,0,0,1,0,0,0,1,0,1},
					{1,0,1,1,1,0,0,1,1,0},
					{0,0,0,0,1,0,0,1,0,1},
					{0,1,1,1,1,1,1,1,0,0},
					{1,1,1,1,1,0,0,1,1,1},
					{0,0,1,0,0,1,1,0,0,1},
			};
		int result = shortestPath(a,0,0,8,8);
		if (result >=10000) {
			System.out.println("No possible path");
		}
		else {
			System.out.println(result);	
		}
		
	}
	static int shortestPath(int a[][],int i,int j,int x,int y) {
		int rows = a.length;
		
		int cols = a[0].length;
		boolean visit[][] = new boolean[rows][cols];
		
	    return shortestPath(a,i,j,x,y,visit);	//This return gives our answer
	    
	}
	//Helalper Function
	static boolean isValid(int a[][],int i,int j,boolean visit[][]) {
		int rows = a.length;
		int cols = a[0].length;
		return i>=0 && j>=0 && i<rows && j<cols && a[i][j]==1 && !visit[i][j];
		
	}
	//Method OverLoading
	static int shortestPath(int a[][],int i,int j,int x,int y, boolean visit[][]) {
		//If source = destination 
		if(!isValid(a,i,j,visit)) return 10000;
		if(i==x && j==y) return 0;
		
		visit[i][j]=true;
		int left  = shortestPath(a,i,j-1,x,y,visit) + 1;
		int bottom = shortestPath(a,i+1,j,x,y,visit) + 1;
		int right = shortestPath(a,i,j+1,x,y,visit) + 1;
		int top = shortestPath(a,i-1,j,x,y,visit) + 1;
		
		//This line makes backtracking possible
		visit[i][j] = false;
		
		return Math.min(Math.min(left, top),Math.min(right,bottom));
		
		
	}

}