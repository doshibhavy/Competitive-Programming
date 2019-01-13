import java.util.*;
import java.lang.*;
import java.io.*;

public class Overlapping_rectangles {
	public static void main (String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    int R1X1,R1Y1,R1X2,R1Y2,R2X1,R2Y1,R2X2,R2Y2;
	    String inp[];
	    while(T>0)
	    {
	    	T--;
	    	inp = br.readLine().split(" ");
	    	R1X1 = Integer.parseInt(inp[0]);
	    	R1Y1 = Integer.parseInt(inp[1]);
	    	R1X2 = Integer.parseInt(inp[2]);
	    	R1Y2 = Integer.parseInt(inp[3]);
	    	inp = br.readLine().split(" ");
	    	R2X1 = Integer.parseInt(inp[0]);
	    	R2Y1 = Integer.parseInt(inp[1]);
	    	R2X2 = Integer.parseInt(inp[2]);
	    	R2Y2 = Integer.parseInt(inp[3]);
	    }
	 }
}