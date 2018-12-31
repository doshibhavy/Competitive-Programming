/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair_cube_count {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0)
		{
			T--;
			int N = Integer.parseInt(br.readLine());
			int k = (int)Math.ceil(Math.cbrt(N)) + 1;
			int count = 0;
			int arr[] = new int[k];
			//System.out.println("K : "+k);
			for(int i=0;i<k;i++)
			{
				arr[i] = (int)Math.pow(i,3);
				//System.out.println("i : "+i+" Pow : "+Math.pow(i,3));
			}
			//for(int x : arr)
			//	System.out.print(x+" ");
			for(int i=0;i<k;i++)
			{
				for(int j=1;j<k;j++)
				{
					if(arr[i]+arr[j]==N)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}