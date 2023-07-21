import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            str+=' ';
            str+='\0';
            String str1="";
            int index=0;
            for(int i=0;i)
            String arr[]=new String[3];
            for(int i=0;str.charAt(i)!='\0';i++)
            {
              if(str.charAt(i)!=' ')
              {
                str1+=str.charAt(i);
                
              }
              if(str.charAt(i)==' ')
              {
                arr[index]=str1;
                str1="";
                index++;
              }
            }

            for(int i=arr.length-1;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }
    
        }