import java.util.*;
import java.lang.*;
import java.io.*;

public class Trailing_zeroes_in_factorial {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int n=0,cnt5=0,cnt2=0;
	    while(T>0)
	    {
	    	T--;
	    	cnt5=0;
	    	n = Integer.parseInt(br.readLine());
	    	for(int i=1;Math.pow(5,i)<=n;i++)
	    	{	
	    		cnt5 += (int)(n/Math.pow(5,i));
	    	}
	    	System.out.println(cnt5);
	    }
	 }
}