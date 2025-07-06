package polymorphism.compile_time;

public class Comp_time{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;

    }
    public static double add(double a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        int res1=add(10,20);
        System.out.println("Result is "+res1);
        int res2=add(10,20,30);
        System.out.println("Result is "+res2);
        double res3=add(20.5, 30);
        System.out.println("Result is "+res3);

    }

}

// 🛒 2. E-commerce Apps – Search Feature
// Overloaded search() methods:

// java
// Copy
// Edit
// void search(String productName);
// void search(String productName, String category);
// void search(String productName, int priceRange);
// Usage:

// Search by name → search("Shoes")

// Search by name + category → search("Shoes", "Men")

// Search by name + price range → search("Shoes", 2000)