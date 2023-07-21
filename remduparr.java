import java.util.*;
public class remduparr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[arr.length-1];
        for(int k=0;k<j;k++)
        {
            count++;
        }
         System.out.println(count);
    }
}
