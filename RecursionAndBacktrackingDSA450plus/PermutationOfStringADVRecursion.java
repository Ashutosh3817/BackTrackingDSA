package RecursionAndBacktrackingDSA450plus;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfStringADVRecursion {
	//For printing unique string we use set because set doesnot include duplicate values
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		permutations("abc",0,2);
	}
	static void permutations(String s , int l,int r) {
		//if(set.contains(s)) 
		     //return;
		//set.add(s);
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=0;i<=r;i++) {
	        s = interchangeChar(s,l,i);
	        permutations(s,l+1,r);
	        s=interchangeChar(s,l,i);
	        //s = interchangeChar(s,l+1,r);
		}
	}
		static String interchangeChar(String s , int a , int b) {
			char array[] = s.toCharArray();
		    char temp = array[a];
		    array[a] = array[b];
		    array[b] = temp;
		    return String.valueOf(array);
		}
		
	}

