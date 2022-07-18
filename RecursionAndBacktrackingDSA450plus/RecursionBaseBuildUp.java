package RecursionAndBacktrackingDSA450plus;
//Find sum of first n Natural Numbers using Recursion
public class RecursionBaseBuildUp {
	public static void main(String[] args) {
		System.out.println(sum(15));
	}
	
static int sum(int n) {
	if(n==1) {
		return 1;
	}
		return sum(n-1)+n;
	}
}