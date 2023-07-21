import java.util.*;
public class stringbuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer string=new StringBuffer(str);
        System.out.println(string.reverse());
        String sub=string.substring(0,3);
        System.out.println(sub);

    }
}
