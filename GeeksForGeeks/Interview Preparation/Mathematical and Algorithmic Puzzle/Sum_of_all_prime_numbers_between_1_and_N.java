/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_of_all_prime_numbers_between_1_and_N {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int max = -1;
		boolean arrOfPrime[] ;
		long ans[];
		for(int i = 0;i<T;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if(max<arr[i])
				max = arr[i];
		}
		arrOfPrime = new boolean[max+1];
		ans = new long[max];
		long sum=0;
		for(int i=2;i<arrOfPrime.length;i++)
	    {
	       	if(arrOfPrime[i]==false)
	       	{
	       		for(int j=2;i*j<=max;j++)
	       		{
	       			arrOfPrime[i*j] = true;
	       		}
	       		sum += i;
	       	}
	       	ans[i-1] = sum;
	   }
	   for(int i=0;i<arr.length;i++)
	   {
	   		System.out.println(ans[arr[i]-1]);
	   }
	}
}