
import java.util.*;
import java.lang.*;
import java.io.*;

public class Series_AP {
	public static void main (String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int A,B,N,ans;
		String inp[];
		while(T>0)
		{
		    T--;
		    inp = br.readLine().split(" ");
		    A = Integer.parseInt(inp[0]);
		    B = Integer.parseInt(inp[1]);
		    N = Integer.parseInt(br.readLine());
		    ans = A+((N-1)*(B-A));
		    System.out.println(ans);
		}
	}
}