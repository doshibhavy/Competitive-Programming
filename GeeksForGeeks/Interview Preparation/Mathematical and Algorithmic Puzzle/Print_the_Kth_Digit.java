/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Print_the_Kth_Digit {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    boolean negFlgN1 = false;
	    int n1,n2,n3;
	    String ans;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        n1 = Integer.parseInt(inp[0]);
	        n2 = Integer.parseInt(inp[1]);
	        n3 = Integer.parseInt(inp[2]);
	        ans = (long)Math.pow(n1,n2)+"";
	        //System.out.println(ans);
	        System.out.println(ans.charAt(ans.length()-n3));
	    }
	}
}