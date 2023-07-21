import java.util.*;
public class amstrong_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem=0,res=0;
        while(n!=0)
        {
            rem=n%10;
            res=res+(rem*rem);
            n/=10;
        }
        System.out.println(res);
    }
}
