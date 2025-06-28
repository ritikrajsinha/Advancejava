enum Laptop{
    Macbook(2000),Xps(1200),Surface(2200),Thinkpad(1800);


    private int price;

    private Laptop(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum_1 {
     public static void main(String[] args)
     {
            // Laptop lap=Laptop.Macbook;
            // System.out.println(lap.getPrice());

            for(Laptop lap:Laptop.values())
            {
                System.out.println(lap.getPrice());
            }
     }

    
}
