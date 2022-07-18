package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;

public class PartitionOfArrayIntoTwoEqualSum {
	public static void main(String[] args) {
		int a[] = {2,1,2,3,4,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		ArrayList<Integer> ans=new ArrayList<>();
		
		boolean ispossible = (sum&1)==0;
		partition(a,sum/2,0,ans);
		
		if(ispossible) {
			for(int e : ans) {
				System.out.println(e + " ");
			}
		}
		else {
			System.out.println("Not Possible");
		}
	}
	static boolean partition(int a[],int sum ,int i,ArrayList<Integer>ans) {
		if(i>=a.length || sum<0) {
			return false;
		}
		if(sum==0) return true;
			ans.add(a[i]);
			
			boolean leftPossible=partition(a,sum-a[i],i+1,ans);
			if (leftPossible) return true;
			
			//This makes backtracking possible
			ans.remove(ans.size()-1);
			return partition(a,sum,i+1,ans);
		}
		
	}

