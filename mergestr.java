import java.util.*;
public class mergestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
        char arr[]=word1.toCharArray();
        char arr1[]=word2.toCharArray();
        String str="";
        int len1=arr.length,i=0;
        int len2=arr1.length,j=0;
        while(i<len1 || j<len2)
        {
            if(i<len1){
            str+=arr[i];
            i++;
            }
            if(j<len2){
            str+=arr1[j];
            j++;
            }
        }
        System.out.println(str);
        
    }
    
    
    }

