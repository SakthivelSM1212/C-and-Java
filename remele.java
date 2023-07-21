import java.util.*;
public class remele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=k)
            {
               temp[j++]=arr[i];
            }
        }
        for(int m=0;m<j;m++)
        {
            System.out.print(temp[m]+" ");
        }
    }
}
