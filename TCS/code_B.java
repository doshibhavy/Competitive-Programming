import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;

class code_B
{
  public static void main (String[] args) throws Exception 
  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Long P = Long.parseLong(br.readLine());
      Long T = Long.parseLong(br.readLine());
      int N1 = Integer.parseInt(br.readLine());
    	double emi_A = 0,emi_B=0;
      String[] inp;
      long cp_A=P,cp_B=P;
      int cnt_A=0,cnt_B=0;
      while(N1>0)
      {
        N1--;
        inp = br.readLine().split(" ");
        int t = Integer.parseInt(inp[0]);
        float rate = Float.parseFloat(inp[1]);
        rate = rate/(12*100);
        //t = t*12;
        emi_A += (P * rate /( 1 - 1 / Math.pow(1 + rate,t * 12)))*t*12;
        //cnt_A+=t;
        //cp_A = cp_A - (P/T)*cnt_A;
        //System.out.println(emi_A);
      }
      //System.out.println();
    	int N2 = Integer.parseInt(br.readLine());
      while(N2>0)
      {
        N2--;
        inp = br.readLine().split(" ");
        int t = Integer.parseInt(inp[0]);
        float rate = Float.parseFloat(inp[1]);
        rate = rate/(12*100);
        //t = t*12;
        emi_B += (P * rate /( 1 - 1 / Math.pow(1 + rate,t * 12)))*t*12;
//        cnt_B+=t;
  //      cp_B = cp_B - (P/T)*cnt_B;
        //System.out.println(emi_B);
      }
   		
      System.out.println(emi_A+"\t"+emi_B);
      if(emi_A>emi_B)
        System.out.println("Bank B");
      else
        System.out.println("Bank A");
  }

}