import java.util.*;
public class wordsplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1,i=0;
        String con=sc.nextLine();
         String str=con+'\0';
        String rev="";
        while(str.charAt(i)!='\0')
        {
           if(str.charAt(i)!=' ')
           {
               rev+=str.charAt(i);
           }
           i++;
           if(str.charAt(i)==' ')
           {
            count++;
           }
        } 
    }
}
