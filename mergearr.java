import java.util.*;
public class mergearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int m=sc.nextInt();
        int k=sc.nextInt();
        int res=m+k;
        int new_arr[]=new int[res];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]!=0)
            {
               new_arr[i]=arr[i];
            }
        }
         for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
            if(arr1[i]!=0)
            {
                new_arr[i]=arr1[i];
            }
        }
         for(int i=0;i<new_arr.length;i++)
        {
             System.out.println(new_arr[i]);
        }
    }
}
