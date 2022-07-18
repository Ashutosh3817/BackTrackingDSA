package RecursionAndBacktrackingDSA450plus;

import java.util.ArrayList;
import java.util.List;

public class WQordBreakBackTracking {
	 
	     static void wordBreak(int n, List<String> dict, String s)
	    { 
	      List<String> ans = new ArrayList<>();

	       break(s,0,dict,"",ans);                                                 
	       return ans;
	    }

	       static void break(String str,int st,ArrayList<String>dict,String temp,List<String> ans){   
			
			if(st== str.length()) {
	            ans.add(temp.substring(0,temp.length()-1));
	            return ;
	        }
	        for(int i=st;i<str.length();i++){
	            String sub = str.substring(st,i+1);
	            if(dict.contains(sub)){
	               
	                break(str,i+1,dict,temp+sub+" ",ans);
	            }
	        }
	    }
public static void main(String[] args) {
	WQordBreakBackTracking w =new WQordBreakBackTracking();
	String s = "catsanddog";
	int n = 5 ;
	ArrayList<String> dict = new ArrayList<>();
	dict.add("cats");
	dict.add("cat");
	dict.add("and");
	dict.add("sand");
	dict.add("dog");
	wordBreak(n,dict,s);
}
	}
