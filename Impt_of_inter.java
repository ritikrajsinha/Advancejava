interface  Computer{
     void  code();
   
}

class Laptop implements Computer{
    public void code()
    {
        System.out.println("Laptop is coding");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop is coding faster");
    }

    
}
class Developer{
    public void devapp(Computer comp)
    {
        comp.code();
    }
}


public class Impt_of_inter{
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer dev=new Desktop();
        Developer dev1=new Developer();
        dev1.devapp(dev);
        
    




    }

}