import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        int rem=0,count=0;
        while(fact!=0)
        {
            rem=fact%10;
            if(rem==0)
            {
                count++;
            }
            fact/=10;
        }
        System.out.println(count);
    }
}
