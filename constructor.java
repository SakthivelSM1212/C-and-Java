public class constructor {
    public static void main(String[] args) {
        sm obj=new sm();
        obj.js();
    }
}
class sm{
    void js(){
          System.out.println("this runs slow");
    }
    sm(){
        System.out.println("This runs fast");
    }
}
