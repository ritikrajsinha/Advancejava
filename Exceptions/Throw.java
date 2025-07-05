class RitikException extends Exception{
    public RitikException(String message){
        super(message);
        
    }

}

public class Throw {
    public static void main(String[] args) {


        int age=1;

        try {

            if(age<18)
            {
                throw new RitikException("Age is less than 18 you cannot vote");
            }
            else{
                System.out.println("You can vote");
            }


            
        } catch (RitikException e) {
            System.out.println("Exception caught: " + e.getMessage());
            
        }
       
         // ➡ Still prints 0 (initial value)
        System.out.println("bye"); // ➡ Always prints
    }
    
}
