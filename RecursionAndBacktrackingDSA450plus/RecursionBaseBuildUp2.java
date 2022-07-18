package RecursionAndBacktrackingDSA450plus;
//calculate power using recursion a^b
public class RecursionBaseBuildUp2 {
	static int stepcount=1;
	public static void main(String[] args) {
		System.out.println(pow(3,4));
		System.out.println("StepCount " + stepcount);
	}
	static int pow(int a , int b) {
		stepcount++;
		if(b == 0) {
			return 1;
		}
		return a*pow(a,b-1);
	}
}
