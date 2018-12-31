/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sieve_of_Eratosthenes {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    boolean[] arr ;
	    int n;
	    String ans;
	    while(T>0)
	    {
	        T--;
	        ans = "";
	        n = Integer.parseInt(br.readLine());
	        arr = new boolean[n+1];
	        for(int i=2;i<arr.length;i++)
	        {
	        	if(arr[i]==false)
	        	{
	        		for(int j=2;i*j<=n;j++)
	        		{
	        			arr[i*j] = true;
	        		}
	        		ans+= i+" ";
	        	}
	        }
	        System.out.println(ans.trim());
	    }
	}
}