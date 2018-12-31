/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Reverse_digits {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp ;
	    StringBuilder strOP;
	    while(T>0)
	    {
	        T--;
	        strOP = new StringBuilder();
	        inp = br.readLine();
	        for(int i=0;i<inp.length();i++)
	        {
	            strOP.append(inp.charAt(inp.length()-1-i));
	        }
	        System.out.println(Integer.parseInt(strOP.toString()));
	    }
	}
}