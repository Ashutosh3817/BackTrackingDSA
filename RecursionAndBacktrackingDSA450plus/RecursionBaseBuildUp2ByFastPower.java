package RecursionAndBacktrackingDSA450plus;
//Fast power means we are finding exponential of a number in log(n) time complexity
public class RecursionBaseBuildUp2ByFastPower {
	static int stepcount=1;
	public static void main(String[] args) {
		System.out.println(fastpow(3,10000));
		System.out.println("StepCount" + stepcount);
	}
	static int fastpow(int a , int b) {
		System.out.println(b);
		stepcount++;
		if(b==0) {
			return 1;
		}
		if(b%2 == 0) {
			return fastpow(a*a,b/2);
		}
		return  a*fastpow(a,b-1);
	}
}
