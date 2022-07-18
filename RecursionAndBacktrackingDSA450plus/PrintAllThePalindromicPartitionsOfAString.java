package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;

public class PrintAllThePalindromicPartitionsOfAString {
	static ArrayList<ArrayList<String>> allPallindromePerms(String s){
		ArrayList<ArrayList<String>> res = new ArrayList<>();
		ArrayList<String> path = new ArrayList<>();
		func(0,s,path,res);
		return res;
	}
	static void func(int index,String s,ArrayList<String> path,ArrayList<ArrayList<String>> res) {
		if(index==s.length()) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int i=index;i<s.length();i++) {
			if(isPalindrome(s,index,i)) {
				path.add(s.substring(index,i+1));
				func(i+1,s,path,res);
				path.remove(path.size()-1);
			}
		}
		
	}
	static boolean isPalindrome(String s ,int start,int end) {
		if(s.charAt(start++) != s.charAt(end--)) return false;
		return true;
	}
	public static void main(String[] args) {
		String s = "nitin";
		System.out.println(allPallindromePerms(s));
	
	}
}
