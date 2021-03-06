/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GCD_of_two_numbers {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    int n1,n2;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        n1 = Integer.parseInt(inp[0]);
	        n2 = Integer.parseInt(inp[1]);
	        System.out.println(gcd(n1,n2));
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