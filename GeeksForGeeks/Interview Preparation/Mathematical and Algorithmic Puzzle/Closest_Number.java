/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Closest_Number {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    boolean negFlgN1 = false;
	    int n1,n2,ans;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        n1 = Integer.parseInt(inp[0]);
	        n2 = Math.abs(Integer.parseInt(inp[1]));
	        negFlgN1 = false;
	        if(n1<0)
	        	negFlgN1 = true;
	        n1 = Math.abs(n1);
	        ans = n1 % n2;
	        if(ans == 0)
	        	System.out.println((negFlgN1)?n1*-1 : n1);
	        else
	        {
	        	if(ans >= n2-ans)
	        	{
	        		System.out.println((negFlgN1)?(n1+n2-ans)*-1 : n1+n2-ans);
	        	}
	        	else
	        		System.out.println((negFlgN1)?(n1-ans)*-1 : n1-ans);	
	        }

	    }
	}
}