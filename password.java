import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char arr[]=str.toCharArray();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
         if(arr[i]>=97 && arr[i]<=122 ||arr[i]>=48 && arr[i]<=57 || arr[i]>=58 && arr[i]<=64)
         {
            flag=1;
         } 
        }
        if(flag==1)
        {
            System.out.println("Strong Password");
        }
        else{
            System.out.println("weak password");
        }
    }
}
