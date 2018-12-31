import java.util.*;
import java.lang.*;
import java.io.*;

public class Nissan_Bit_Pattern {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String inp[],str;
		int n=0,m=0,len=0;
		while(T>0)
		{
			T--;
			inp = br.readLine().split(" ");
			m = Integer.parseInt(inp[0]);
			n = Integer.parseInt(inp[1]);
			len = Integer.parseInt(br.readLine());
			str = br.readLine();
			int cnt0=0,cnt1=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='1')
					cnt1++;
				else
					cnt0++;
			}
			if(n==0 && m==0)
				System.out.println("NO");
			else if(len%(n+m)==0)
				checkForActualValue(n,m,len,cnt0,cnt1);
			else if(len%(n+m) == m)
				checkForActualValueMinusM(n,m,len,cnt0,cnt1);
			else
				System.out.println("NO");
		}
	}
	public static void checkForActualValue(int n,int m,int len,int cnt0,int cnt1)
	{
		//int req0=-1,req1=-1;
		int divisor = len/(n+m);
		if(cnt0%divisor==0 && cnt1%divisor==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	public static void checkForActualValueMinusM(int n,int m,int len,int cnt0,int cnt1)
	{
		int divisor = len/(n+m);
		if(cnt0%(divisor+1)==0 && cnt1%divisor==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}