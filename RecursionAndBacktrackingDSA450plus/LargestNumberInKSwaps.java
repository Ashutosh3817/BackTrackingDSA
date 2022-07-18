package RecursionAndBacktrackingDSA450plus;

public class LargestNumberInKSwaps {
	/*
	 public static String swaped(String str,int i,int j){
	        char ith = str.charAt(i);
	        char jth = str.charAt(j);
	        
	        String left = str.substring(0,i);
	        String middle = str.substring(i+1,j);
	        String right = str.substring(j+1);
	        
	        return left + jth + middle + ith + right ; 
	        
	    }*/
	 static String ans = "";
	 public static String findMaximumNum(String str,int k){
	        ans=str;
	        func(str.toCharArray(),k,0);
	        return ans;
	    }
	    static int max;
	    public static void  func(char[] str, int k,int idx)
	        { 
	          
	    	  if(k==0 || idx == str.length) {
	    		  String sp =new String(str);
	    		  if(ans.compareTo(sp)<0) {
	    			  ans = sp;
	    		  }
	    		  return;
	    	  }
	    	  char max =str[idx];
	            
	    	  for(int i=idx+1;i< str.length;i++)
	          {
	              if(str[i]>max)
	              {
	                  max=str[i];
	              }
	          }
	          if(max!=str[idx])
	          {
	              k--;
	          }

	          for(int i=idx;i<=str.length-1;i++)
	          {
	              if(str[i]==max)
	              {
	                  swaped(str,idx,i);
	                  func(str,k,idx+1);
	                  swaped(str,i,idx);
	              }
	          }

	        }
	    public static void swaped(char []s,int i,int j)
	    {
	        char temp=s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        return;
	    }

	 
	    public static void main(String[] args) {
	    	String str = "1234567";
	    	int k=4;
	    	System.out.println(findMaximumNum(str,k));
	    }
	}

