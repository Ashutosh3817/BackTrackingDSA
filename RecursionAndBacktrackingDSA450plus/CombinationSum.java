package  RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;
import java.util.List;
public class CombinationSum {
	public static List<List<Integer>> combinationSum(int[] candidates,int target){//power set
		List<List<Integer>> comb = new ArrayList<>();
		generatedCombination(0,candidates,new ArrayList(),comb,target);
		return comb;
	}
	 static void generatedCombination(int start , int[] nums,List<Integer> current,List<List<Integer>> comb,int target) {
		if(target==0)
			comb.add(new ArrayList(current));
		
		if(target<0) return;
		
		for(int i=start;i<nums.length;i++) {
			current.add(nums[i]);
			generatedCombination(i,nums,current,comb,target-nums[i]);
			current.remove(current.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] candidates= {7,2,6,5};
		int target=16;
		System.out.println(combinationSum(candidates,target));
	}
}
