import java.math.BigInteger; 
import java.util.*;
import java.lang.*;
import java.io.*;

public class nCr {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int n=0,r=0;
		String inp[];
		long res = 1;
		BigInteger f ;
		while(T>0)
		{
			T--;
			inp = br.readLine().split(" ");
			n = Integer.parseInt(inp[0]);
			r = Integer.parseInt(inp[1]);
			res = 1;
			if(r>=n)
				System.out.println("0");
			else
			{
				if(n-r<r)
					r = n-r;
				f = new BigInteger("1");
				for(int i = 0; i < r; ++i) 
    			{ 
        			f = f.multiply(BigInteger.valueOf(n-i));
        			f = f.divide(BigInteger.valueOf(i+1)); 
		        	//res /= (i + 1);
    			}
				System.out.println(f.mod(BigInteger.valueOf(1000000007)));
				//735309323
			}
		}
	}
}