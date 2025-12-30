// Method Overriding Example 
/* Method Overriding is a concept where a child class provides its own implementation of a method that already exists 
in the parent class, with the same method name and parameters, and the method call is resolved at runtime.*/
class Signal {
    void color() {
        System.out.println("Welcome to Traffic Signal system");
    }
}

class Traffic extends Signal {
    @Override
    void color() {
        System.out.println("Red light - Stop");
    }
}

class Ready extends Signal {
    @Override
    void color() {
        System.out.println("Yellow light - Get Ready");
    }
}

class Go extends Signal {
    @Override
    void color() {
        System.out.println("Green Light - Go");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Signal signal;

        signal = new Signal();
        signal.color();         // Start the traffic Signal System

        signal = new Traffic();
        signal.color();         // Output: Red light - Stop

        signal = new Ready();
        signal.color();   

        signal = new Go();
        signal.color();  
    }
}

