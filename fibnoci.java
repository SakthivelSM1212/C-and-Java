import java.util.*;
public class fibnoci {
	public static void main(String arg[])	
	{
		int num,s,i;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		s=0;
		int n1=1,n2=1;
		for(i=3;i<=num;i++)
		{
			s=n1+n2;
			n1=n2;
         	n2=s;
            System.out.print(n1+" "+n2);
            System.out.print(s+" ");
		}
	}
}
