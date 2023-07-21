import java.util.*;
public class petrdicar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a1=sc.nextInt();
         int b1=sc.nextInt();
         int c1=sc.nextInt();
         int d1=sc.nextInt();
         int e1=sc.nextInt();
         int a2=sc.nextInt();
         int b2=sc.nextInt();
         int c2=sc.nextInt();
         int d2=sc.nextInt();
         int e2=sc.nextInt();
         int res=c1+((d1/a1)*b1+e1)*60;
         int result=c2+((d2/a2)*b2+e2)*60;
         if(res<result)
         {
            System.out.println("Petrol");
         } else{
            System.out.println("Diesal");
         }
    }
}
