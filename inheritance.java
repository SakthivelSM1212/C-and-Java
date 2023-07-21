public class inheritance {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        addition obj=new addition();
        obj.b();
    }
}
class add{
    void a(){
        int res=a+b;
         System.out.println(a+b);
    }
} class addition extends add{
      void b(){
        System.out.println();
      }
}
