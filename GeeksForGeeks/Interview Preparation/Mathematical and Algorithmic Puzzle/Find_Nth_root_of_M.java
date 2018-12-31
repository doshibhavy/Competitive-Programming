/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Find_Nth_root_of_M {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String inp[];
		int N=0;
		double M=0;
		while(T>0)
		{
			T--;
			inp = br.readLine().split(" ");
			N = Integer.parseInt(inp[0]);
			M = Double.parseDouble(inp[1]);
			//double ans = Math.pow(M,1/(double)N);
			double ans = nthRoot(M,N);
			//System.out.println(ans);
			if(Math.pow(Math.round(ans),N) == M)
				System.out.println((int)Math.round(ans));
			else
				System.out.println("-1");
		}
	}
	static double nthRoot(double A, int N) 
    { 
          
        // intially guessing a random number between 
        // 0 and 9 
        double xPre = Math.random() % 10; 
      
        // smaller eps, denotes more accuracy 
        double eps = 0.01; 
      
        // initializing difference between two 
        // roots by INT_MAX 
        double delX = 2147483647; 
      
        // xK denotes curreAnt value of x 
        double xK = 0.0; 
      
        // loop untill we reach desired accuracy 
        while (delX > eps) 
        { 
            // calculating current value from previous 
            // value by newton's method 
            xK = ((N - 1.0) * xPre + (double)A / Math.pow(xPre, N - 1)) / (double)N; 
            delX = Math.abs(xK - xPre); 
            xPre = xK; 
        } 
      
        return xK; 
    }
}