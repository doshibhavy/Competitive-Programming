/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Binary_number_to_decimal_number {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int B, ans;
	    while(T>0)
	    {
	        T--;
	        ans = Integer.parseInt(br.readLine(),2);
	        System.out.println(ans);
	    }
	}
}