/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Factorial {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int n;
	    long ans;
	    while(T>0)
	    {
	        T--;
	        n = Integer.parseInt(br.readLine());
	        ans = 1;
	        if(n<=1)
	            System.out.println("1");
	        else
	        {
	            for(int i=n;i>=1;i--)
	            {
	                ans = ans * i;
	            }
	            System.out.println(ans);
	        }
	    }
	}
}