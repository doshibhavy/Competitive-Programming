import java.util.*;
import java.lang.*;
import java.io.*;

class Add_two_fractions
{ 	
    static void addFraction(int num1, int den1, int num2, int den2)
    {
    	
    	//int gcd = gcd(den1,den2);
        int numx = (num1*den2) + (num2*den1);
        int denx = den1*den2;
        int gcd = gcd(numx,denx);
        numx = numx/gcd;
        denx = denx/gcd;
        System.out.println(numx+"/"+denx);
    }

    public static void main (String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    String inp[];
	    int num1,num2,den1,den2;
	    while(T>0)
	    {
	        T--;
	        inp = br.readLine().split(" ");
	        num1 = Integer.parseInt(inp[0]);
	        den1 = Integer.parseInt(inp[1]);
	        num2 = Integer.parseInt(inp[2]);
	        den2 = Integer.parseInt(inp[3]);
	        addFraction(num1,den1,num2,den2);
	    }
	}

	public static int gcd(int n1,int n2)
	{
	    int r;
	    while(n1!=0)
	    {
	        r = n2%n1;
	        n2 = n1;
	        n1 = r;
	    }
	    return n2;
	}
}