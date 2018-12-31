/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_of_Digit_is_Pallindrome_or_not {
	public static void main (String[] args) throws Exception {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int N, sum;
	    boolean flg ;
	    String inp;
	    while(T>0)
	    {
	        T--;
	        N = Integer.parseInt(br.readLine());
	        sum = 0;
	        flg = false;
	        while(N!=0)
	        {
	            sum+=N%10;
	            N = N /10;
	        }
	        inp = (sum+"");
	        //System.out.println(inp.length());
	        for(int i=0;i<=inp.length()/2;i++)
	        {
	        //	System.out.println(inp.charAt(i)+" "+inp.charAt(inp.length()-i-1));
	            if(inp.charAt(i)!=inp.charAt(inp.length()-i-1))
	            {
	                flg=true;
	                break;
	            }
	        }
	        if(flg)
	            System.out.println("NO");
	        else
	            System.out.println("YES");
	    }
	}
}