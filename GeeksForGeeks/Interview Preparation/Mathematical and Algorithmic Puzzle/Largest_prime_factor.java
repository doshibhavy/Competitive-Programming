/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Largest_prime_factor {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String inp[];
		long N=0,ans=0;
		for(int i=0;i<T;i++)
		{
			N = Long.parseLong(br.readLine());
			ans = maxPrimeFactors(N);
			System.out.println(ans);
		}
		
	}
	static long maxPrimeFactors(long n) 
    { 
        long maxPrime = -1; 
        while (n % 2 == 0) { 
            maxPrime = 2;
            n >>= 1; 
        } 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            while (n % i == 0) { 
                maxPrime = i; 
                n = n / i; 
            } 
        } 
        if (n > 2) 
            maxPrime = n; 
        
        return maxPrime; 
    }
}