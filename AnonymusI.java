class A{
    public void show()
  {
    System.out.println("Inside class A");
  }

}

public class AnonymusI {
    public static void main(String[] args) {
        // Anonymous class
        A obj = new A() {
            
            public void show() {
                System.out.println("Inside anonymous class");
                }
            };
            obj.show();
            
    }
    
}
