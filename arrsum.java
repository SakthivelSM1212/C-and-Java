import java.util.*;
public class arrsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               if(arr[i]+arr[j]==k)
               {
                count++;
               }
               arr[j]=0;
            }
        }
        System.out.println(count);
    }
}
