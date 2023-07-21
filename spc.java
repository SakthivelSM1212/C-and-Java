import java.util.*;
public class spc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=30 && str.charAt(i)<=47 || str.charAt(i)>=123 && str.charAt(i)<=126 || str.charAt(i)>=91 && str.charAt(i)<=95 || str.charAt(i)>=58 && str.charAt(i)<=64)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
