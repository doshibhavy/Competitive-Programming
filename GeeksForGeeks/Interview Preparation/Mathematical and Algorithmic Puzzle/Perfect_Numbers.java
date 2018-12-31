/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Perfect_Numbers {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0)
		{
			T--;
			long N = Long.parseLong(br.readLine());
			long sum = 1;
			for(long i=2;i<=Math.sqrt(N);i++)
			{
				if(N%i ==0)
				{
					sum+=i;
					sum+=(N/i);
				}
			}
			//	if(sum==N)
				System.out.println((sum==N)?"1":"0");
		}
	}
}