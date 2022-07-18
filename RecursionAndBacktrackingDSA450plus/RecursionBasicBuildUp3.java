package RecursionAndBacktrackingDSA450plus;
//Find all the path in m*n grid
public class RecursionBasicBuildUp3 {
	public static void main(String[] args) {
		System.out.println(mat(4,4));
	}
	static int mat(int m,int n ) {
		if(m==1 || n==1)	return 1;
		
		return mat(m,n-1)+mat(m-1,n);
	}
}
