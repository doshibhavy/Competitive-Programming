import java.io.*;
import java.util.*;

public class queue {
    public static void main(String[] args) throws Exception{
        int N,K,L=0,R=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[];
        temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        K = Integer.parseInt(temp[0]);
        //int[] factArr = new int[K];
        String arr[] = br.readLine().split(" ");
        int[] newArr = new int[N];
        newArr[N-1] = 0;
        //factArr[0] = 1;
        //for(int i=1;i<K;i++)
        //{
        //    factArr[i] = (i+1)*factArr[i-1];
        //}
        
        for(int p=N-2;p>=0;p--)
        {
            R = Integer.parseInt(arr[p+1]);
            L = Integer.parseInt(arr[p]);
            if(L>R)
            {
                newArr[p] = newArr[p+1]+1;
            }
            else
            {
                newArr[p]=0;
            }
        }
        double ans=1;
        for(int i=0;i<N;i++)
        {
            ans = (ans * (newArr[i]+1))%1000000007;
        }
        System.out.println((int)ans);
    }
}
