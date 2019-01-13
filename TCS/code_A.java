import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

class code_A
{
  public static void main (String[] args) throws Exception 
  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    double v1 = Double.parseDouble(br.readLine());
    	double r1 = Double.parseDouble(br.readLine());
    	double v2 = Double.parseDouble(br.readLine());
    	double r2 = Double.parseDouble(br.readLine());
    	int N = Integer.parseInt(br.readLine());
   		double x1 = Math.sin(Math.toRadians((v1*N)%360))*r1;
      double y1 = Math.cos(Math.toRadians((v1*N)%360))*r1;
      double x2 = Math.sin(Math.toRadians((v2*N)%360))*r2;
      double y2 = Math.cos(Math.toRadians((v2*N)%360))*r2;
      double ans = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
      //System.out.println(Math.round((int)ans * 100) / (double)100);
      DecimalFormat f = new DecimalFormat("##.00");
      System.out.println(f.format(ans));
  }

}