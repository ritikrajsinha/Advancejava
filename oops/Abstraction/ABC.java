package Abstraction;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();

    public void drive() {
        
        System.out.println("Driving the vehicle...");
    
    }
    public void start()
    {
        startEngine();
    }
    public void stop()
    {    
         stopEngine();
        
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

public class ABC {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.drive();
        myCar.stop();
    }
} 