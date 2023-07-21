import java.util.*;
public class fingers {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int res=sc.nextInt();
        int num=res%8;
        if(num==1)
        {
            System.out.println("Thumb");
        }
        else if(num==2 || num==0)
        {
            System.out.println("pointer");
        } else if(num==3 || num==7)
        {
             System.out.println("middle");
        } else if(num==4 || num==6)
        {
            System.out.println("Ring");
        } else if(num==5)
        {
            System.out.println("little");
        }

    }
}
