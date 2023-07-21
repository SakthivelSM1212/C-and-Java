import java.util.Scanner;

public class abstraction {
    public static void main(String[] args) {
      a obj=new a();
      obj.sum();

    }
}
abstract class add{
   abstract void sum();
}
class a extends add{
    void sum()
    {
        System.out.println("Executed");
    }
}