/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GCD_of_Array {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    int n,tmp;
	    while(T>0)
	    {
	        T--;
	        n = Integer.parseInt(br.readLine());
	        int gcd =0;
	        inp = br.readLine().trim().split(" ");
	        if(n==1)
	        	System.out.println(inp[0]);
	        else
	        {
	        	gcd = Integer.parseInt(inp[0]);
	        	for(int i=1;i<n;i++)
	        	{
	        		tmp = Integer.parseInt(inp[i]);
	        		gcd = gcd(gcd,tmp);
	        	}
	        	System.out.println(gcd);
	        }
	   	}
	}
	public static int gcd(int n1,int n2)
	{
	    int r;
	    while(n1!=0)
	    {
	        r = n2%n1;
	        n2 = n1;
	        n1 = r;
	    }
	    return n2;
	}
}