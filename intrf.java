class intrf implements printable{  
    public void print(){System.out.println("Hello");
}  
    
    public static void main(String args[]){  
        intrf obj = new intrf();  
        obj.print();  
    }  
}  
interface printable{  
void print();  
}  
interface extends nonprintable{
    void put();
}
