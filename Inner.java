class A{
    private int a;

   public void show()
 {
    System.out.println("Inside show() method");
 }

 class B{
    public void config()
    {
        System.out.println("Inside config() method");
    }
 }
    
   

}


public class Inner {
    public static void main(String[] args) {
        A a=new A();
        a.show();
        A.B b= a.new B();
        b.config();


    }
    
}
