package polymorphism.Runttime;

interface Payment {
    void payment();
}

class CreditCard implements Payment {
    public void payment() {
        System.out.println("Payment by Credit Card");
    }
}
class Upi implements Payment{
    public void payment() {
        System.out.println("Payment by UPI");
        }
}

public class Method_ov {
    public static void main(String[] args) {
        Payment p = new CreditCard();  
        Payment upi=new Upi();
        upi.payment();
        p.payment();
    }

}
