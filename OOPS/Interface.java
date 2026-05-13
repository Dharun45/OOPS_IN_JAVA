// Interface
/* An interface is a fully abstract type in Java that defines a set of rules (contract) that a class must follow when it implements the interface. */


interface Playable {
    void play();
}

interface Recordable {
    void record();
}


// implements BOTH interfaces
class SmartPlayer implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Playing media...");
    }

    @Override
    public void record() {
        System.out.println("Recording started...");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPlayer sp = new SmartPlayer();
        sp.play();
        sp.record();
    }
}