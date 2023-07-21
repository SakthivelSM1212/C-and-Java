import java.util.*;
public class monkey{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         int j=sc.nextInt();
         int m=sc.nextInt();
         int p=sc.nextInt();
         int res=(m/k)+(p/j);
         int result=n-res;
         System.out.println(result);

    }
}