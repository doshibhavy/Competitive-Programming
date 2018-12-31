/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LCM_And_GCD {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    int n1,n2;
	    int lcm,gcd;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        n1 = Integer.parseInt(inp[0]);
	        n2 = Integer.parseInt(inp[1]);
	        gcd = gcd(n1,n2);
	        lcm = (n1*n2)/gcd;
	        System.out.println(lcm+" "+gcd);
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