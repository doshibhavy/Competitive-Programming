import java.util.*;
import java.lang.*;
import java.io.*;

public class Triangular_Number
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int n = 0;
	    int n1,res;
	    while(T>0)
	    {
	    	T--;
	    	n = Integer.parseInt(br.readLine());
	    	n1 = (int)Math.floor(Math.sqrt(2*n));
	    	System.out.println("N1:"+n1);
	    	res = (n1*(n1+1))/2;
	    	if(res==n)
	    		System.out.println("1");
	    	else
	    		System.out.println("0");
	    }
	 }
}