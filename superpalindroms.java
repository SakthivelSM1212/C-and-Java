import java.util.*;
public class superpalindroms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double res=0;
        int result=0;
        for(int i=1;i<n;i++)
        {
            res=Math.sqrt(i);
            // result=(int)res;
            System.out.print(res+" ");
        }
    }
}
