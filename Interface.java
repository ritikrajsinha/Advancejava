interface A{

     int a=10;
     String c="ritik";

    void methodA();
    void methodAB();
}

class Demo implements A{
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodAB(){
        System.out.println("Method B");
        
    }
    
}


public class Interface {
    public static void main(String[] args)
    {
        A obj=new Demo();
        obj.methodA();
        obj.methodAB();
        System.out.println(A.a);
        System.out.println(A.c);



    }
}
