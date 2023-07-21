import java.util.*;
public class remstrprob{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=0,m=3,count=0;
        String str1="";
        String str2="";
        int len=str.length()/6;
        for (int j = 0; j < len; j++) 
        {
            if(j%2==0)
            {
            for(int i=n;i<m;i++)
            {
            str1+=str.charAt(i);
            }
            n=n+3;
            m=m+3;
            for(int i=n;i<m;i++)
            {
                str2+=str.charAt(i);
            }
            if(str1.equals(str2))
            {
                count++;
            }
            n=n+3;
            m=m+3;
            str1="";
            str2="";
    }
        if(j%2!=0)
        {
        for(int i=n;i<m;i++)
        {
           str1+=str.charAt(i);
        }
        n=n+3;
        m=m+3;
        for(int i=n;i<m;i++)
        {
            str2+=str.charAt(i);
        }
        String str3="";
        for(int k=str2.length()-1;k>=0;k--)
        {
            str3+=str2.charAt(k);
        }
        if(str1.equals(str3))
        {
            count++;
        }
        n=n+3;
        m=m+3;
        str1="";
        str2="";
        str3="";
    }
    }
    if(count==len)
    {
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
}
}
