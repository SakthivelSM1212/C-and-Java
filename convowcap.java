import java.util.*;
public class convowcap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char arr[]=str.toCharArray();
        String res_string="";
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
           {
            arr[i]=(char)(arr[i]-32);
           }
            res_string+=arr[i];
        }
        System.out.println(res_string);
    }
}
