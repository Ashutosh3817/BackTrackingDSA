package RecursionAndBacktrackingDSA450plus;

import java.util.Vector;

public class CoinGameTheoryGreedyAlgorithm {
	static void findMin(int deno[],int n) {
		Vector<Integer> ans = new Vector<>();
		int v=12;
		for(int i=n-1;i>0;i--) {
			while( v >= deno[i]) {
				 v -= deno[i];
				ans.add(deno[i]);
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.elementAt(i));
		}
		
	}
	public static void main(String[] args) {
		
		int deno[] = {1,5,7,3,2,4};
		int n = deno.length;
		findMin(deno,n);
	}
	}