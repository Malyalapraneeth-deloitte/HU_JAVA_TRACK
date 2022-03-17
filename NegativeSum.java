import java.util.*;
public class NegativeSum {

    public static void main(String[] args){
        NegativeSum sumNeg = new NegativeSum();
        int arr[] = { 1,3,-1,2,-3};
        int n =arr.length;
        int i,j,k,count=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((arr[i]+arr[j])<0)
                    count++;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if((arr[i]+arr[j]+arr[k])<0)
                        count++;
                }
            }
        }
        System.out.println("Number of sub arrays whose sum is negative is : " + count);
    }

}
