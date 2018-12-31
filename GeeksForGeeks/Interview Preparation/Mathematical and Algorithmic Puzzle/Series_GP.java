/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Series_GP {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    float n1,r,a;
	    float n;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        a = Float.parseFloat(inp[0]);
	        n1 = Float.parseFloat(inp[1]);
	        n = Integer.parseInt(br.readLine());
	        r = n1/a;
	        if(n==1)
	        {
	        	System.out.println((int)Math.floor(a));
	        }
	        else if(n==2)
	        {
	        	System.out.println((int)Math.floor(n1));	
	        }
	        else
	        {
	        	System.out.println((int)Math.floor(a*Math.pow(r,n-1)));
	        }
	    }
	}
}