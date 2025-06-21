abstract class car{
    public abstract void drive();

    public  void stop(){
        System.out.println("Car stopped");

    }
    public void playmusic()
    {
        System.out.println("Music is playing");

    }

    

}

class Wagon extends car{
    public void drive(){
        System.out.println("Wagon is driving");
    }

    public void stop()
    {
        System.out.println("Wagon stopped");
    }
    

}
public class Abs{
    public static void main(String[] args) {
        car cr=new Wagon();
        cr.drive();
        cr.stop();
        cr.playmusic();
    }

}