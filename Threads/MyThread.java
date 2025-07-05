class Demo1 extends Thread {
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Ritik is printing");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }

}
class Demo2 extends Thread{
    public void run()
    {
        for (int i = 1; i<=100 ; i++) {

            System.out.println("Riya is printing");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}



public class MyThread{
    public static void main(String[] args) {
        Demo1 t1=new Demo1();
        Demo2 t2=new Demo2();
      try{
        Thread.sleep(10);

      }
      catch(Exception e)
      {
        System.out.println("Exception caught"+e.getMessage());
      }
        t1.start();
        t2.start();
    }
}
