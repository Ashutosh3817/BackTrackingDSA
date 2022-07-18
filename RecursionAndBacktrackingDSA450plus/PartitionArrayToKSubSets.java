package RecursionAndBacktrackingDSA450plus;

public class PartitionArrayToKSubSets {
	
	public static boolean isKPartitionPossible(int[] a,int n ,int k) {
		
		boolean[] vis = new boolean[n];
		int target = 0 ; 
		for(int i :a) {
			target += i;
		}
		if(target%k!=0) return false;
		
		if(n<k) return false ;
		return dfs(0,0,0,target,k,vis,a);
	
	}
	
	public static boolean dfs(int i,int sum,int count,int target,int k,boolean[] vis,int[]a) {
		if(sum>target/k) return false;
		
		if(count==k) return true;
		
		for(int j=0;j<a.length;j++) {
			if(!vis[j]) {
				vis[j] =true;
				sum += a[j];
				int tempSum = sum;
	//Storing in tempsum so that it becomes easy to backtrack
				if(sum==(target/k)) {
					tempSum=0;
					count +=1;
				}
				if(dfs(j,tempSum,count,target,k,vis,a)) return true;
				//BackTrack
				if(sum>target/k) count--;
				sum -= a[i];
				vis[j] = false;
			}
		}
		return false;
	}
public static void main(String[] args) {
	int[]a = {2,1,4,5,6};
	int N=5;
	int k=3;
	System.out.println(isKPartitionPossible(a,N,k));
}
}

