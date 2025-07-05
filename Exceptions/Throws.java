

public class Throws
{
     public static int divide (int a,int b) throws Exception
    {
        return a/b;

    }


    public static void main(String[] args) {


        try{

            int c=divide(10,0);
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic Exception"+ e);
            e.printStackTrace();
        }

        


    }

}