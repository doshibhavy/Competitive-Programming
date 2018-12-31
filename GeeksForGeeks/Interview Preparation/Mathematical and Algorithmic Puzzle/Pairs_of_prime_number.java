/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pairs_of_prime_number {
	public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    boolean[] arr ;
	    int inpArr[] = new int[T];
	    int max = 0;
	    for(int i=0;i<T;i++)
	    {
	        inpArr[i] = Integer.parseInt(br.readLine());
	        if(max<=inpArr[i])
	            max = inpArr[i];
	    }
	    arr = new boolean[max+1];
	    ArrayList<Integer> lst = new ArrayList<Integer>();
	    for(int i=2;i<arr.length;i++)
	    {
	       	if(arr[i]==false)
	       	{
	       		for(int j=2;i*j<=max;j++)
	       		{
	       			arr[i*j] = true;
	       		}
	       		lst.add(i);
	       	}
	    }
	    String ans="";
        for(int i=0;i<inpArr.length;i++)
        {
        	ans = "";
            for(int j=0;j<lst.size() && lst.get(j)<=inpArr[i];j++)
            {
                for(int k=0;k<lst.size() && lst.get(k)<=inpArr[i];k++)
                {
                	if(lst.get(j)*lst.get(k) <= inpArr[i])
                	{
                		ans+= lst.get(j)+" "+lst.get(k)+" ";
                	}
                }
            }
            System.out.println(ans.trim());
        }
	}
}