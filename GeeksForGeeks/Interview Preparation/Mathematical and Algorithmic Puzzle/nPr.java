/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class nPr {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int n,r;
	    long ans=1;
	    String[] inp;
	    while(T>0)
	    {
	        T--;
	        ans = 1;
	        inp = br.readLine().split(" ");
	        n = Integer.parseInt(inp[0]);
	        r = Integer.parseInt(inp[1]);
	        for(int i=1;i<=r;i++)
	        {
	            ans = ans*n;
	            n--;
	        }
	        System.out.println(ans);
	    }
	}
}