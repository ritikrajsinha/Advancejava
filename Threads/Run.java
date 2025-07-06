class Demo1 implements Runnable {
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
class Demo2 implements Runnable{
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



public class Run{
    public static void main(String[] args) {
        Demo1 t1=new Demo1();
        Demo2 t2=new Demo2();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
     
    }
}
