import java.util.*;
public class doctorscli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<17){
                sum+=200;
            } else if(arr[i]>=17 && arr[i]<40)
            {
                sum+=400;
            } 
            else
            {
                sum+=300;
            }
        }
        System.out.println(sum);

    }
}
