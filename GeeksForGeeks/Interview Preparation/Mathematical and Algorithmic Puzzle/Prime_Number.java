/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Prime_Number {
public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int n;
	    long ans;
	    boolean flg;
	    while(T>0)
	    {
	        T--;
	        n = Integer.parseInt(br.readLine());
	        flg = true;
	        for(int i=2;i<n;i++)
	        {
	        	if(n%i ==0)
	        	{
	        		flg = false;
	        		break;
	        	}
	        }
	        if(flg)
	        	System.out.println("Yes");
	        else
	        	System.out.println("No");
	    }
	}
}