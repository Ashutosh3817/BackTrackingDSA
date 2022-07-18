package RecursionAndBacktrackingDSA450plus;

import java.util.HashMap;

public class PartitionEqualSubSetsSum {
	public static boolean canPartition(int[] nums) {
		int total = 0 ; 
		for(int i : nums) {
			total += i;
			
		}
		if(total %2 != 0) return false;
		
		return canPartition(nums,0,0,total, new HashMap<String,Boolean>());
	}
	
	public static boolean canPartition(int[] nums,int index,int sums,int total,HashMap<String,Boolean>state) {
		String current = index + " " + sums;
		if(state.containsKey(current)) {
			return state.get(current);
		}
		if(sums*2==total) return true;
		
		if(sums>total/2 || index>=nums.length) {
			return false;
			
		}
		boolean foundPartition = canPartition(nums,index+1,sums,total,state)|| canPartition(nums,index+1,sums+nums[index],total,state);
		state.put(current, foundPartition);
		return foundPartition;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,5,11,5};
		System.out.println(canPartition(nums));
	}
}
