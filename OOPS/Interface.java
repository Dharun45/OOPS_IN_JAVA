// Interface
interface Payment {
    void pay();
}

// Implementation 1
class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

// Implementation 2
class Card implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        // Using UPI
        Payment p1 = new UPI();
        p1.pay();

        // Using Card
        Payment p2 = new Card();
        p2.pay();
    }
}