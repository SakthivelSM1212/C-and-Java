import java.util.*;
public class len {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,rem=0;
        while(n!=0)
        {
           rem=n%10;
           count++;
           n/=10;
        }
        System.out.println(count);
    }
}