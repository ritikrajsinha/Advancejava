class Atm{
    private double balance=100000.00;
    private String pin="1234";
    public void cashwithdraw(String enteredPin,double amount)

    {
        if(enteredPin.equals(pin)&&balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Withdarwal successfull");
            
        }
        else{
            System.out.println("Invalid pin or insufficient balance");
        }


    }
    public void checkBalance(String EnteredPin)
    {
        if(EnteredPin.equals(pin))
        {
            System.out.println(balance);
        }
    else{
        System.out.println("Invalid pin");
    }
    }
}


public class Encap{
    public static void main(String[] args) {
        Atm atm=new Atm();
        atm.cashwithdraw("1234", 1000);
        atm.checkBalance("1234");
        
    }

}