import java.util.*;
import java.lang.*;
import java.io.*;

class Divisible_3
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String inp[] = br.readLine().split(" ");
	    String inpStr = inp[0];
	    int K = Integer.parseInt(inp[1]);
	    int[] arr = new int[inpStr.length()+1];
	    for(int i=1;i<arr.length;i++)
	    {
	    	int t = Integer.parseInt(inpStr.charAt(i-1)+"");
	    	arr[i] = arr[i-1] + t;
	    	//System.out.println(i+" Upto Sum : "+arr[i]);
	    }
	    while(K>0)
	    {
	    	K--;
	    	inp = br.readLine().split(" ");
	    	int L = Integer.parseInt(inp[0]);
	    	int R = Integer.parseInt(inp[1]);
	    	//System.out.println(arr[R]-arr[L-1]);
	    	if((arr[R]-arr[L-1])%3==0)	
	    		System.out.println("Yes");
	    	else
	    		System.out.println("No");
	    }
	}
}