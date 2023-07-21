import java.util.*;
public class tripletsarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int minarr[]=new int[n];
        int plusarr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]<0)
          {
            minarr[i]=arr[i];
          } else
          {
            plusarr[i]=arr[i];
          }
        } 
        for(int i=0;i<n;i++)
        {
            System.out.print(minarr[i]);
        }
    }
}
