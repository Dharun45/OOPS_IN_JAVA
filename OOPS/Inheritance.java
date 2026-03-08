// Inheritance in OOps
/* Inheritance means one class use the Properties and methods of an another class without rewriting the code */

// In inheritance, the child class can access all parent class features,
// but the parent class cannot access child class features.
class Cricket {
    void format() {
        System.out.println("Cricket formats: Test | ODI | T20");
    }
}

class Test extends Cricket {
    void format1() {
        System.out.println("Format 1: Test");
    }

    void bestPlayer1() {
        System.out.println("Best Test Player: Sachin Tendulkar");
    }

    void bestCaptain1() {
        System.out.println("Best Test Captain: Virat Kohli");
    }
}

class Odi extends Test {
    void format2() {
        System.out.println("Format 2: ODI");
    }

    void bestPlayer2() {
        System.out.println("Best ODI Player: Jack kallis");
    }

    void bestCaptain2() {
        System.out.println("Best ODI Captain: Kumara Sangakkara");
    }
}

class T20 extends Odi {
    void format3() {
        System.out.println("Format 3: T20");
    }

    void bestPlayer3() {
        System.out.println("Best T20 Player: Chris Gayle");
    }

    void bestCaptain3() {
        System.out.println("Best T20 Captain: Samuel Badree");
    }
}
    
public class Inheritance {
    public static void main(String args[]) {
        // Test tt = new Test();
        // tt.format();
        // tt.bestPlayer();
        // tt.bestCaptain();

        T20 tt = new T20();

        // Cricket Format
        tt.format();
        System.out.println();

        // For Ultimate Test format
        tt.format1();
        tt.bestPlayer1();
        tt.bestCaptain1();
        System.out.println();

        // For Odi format
        tt.format2();
        tt.bestPlayer2();
        tt.bestCaptain2();
        System.out.println();

        // For T20 format
        tt.format3();
        tt.bestPlayer3();
        tt.bestCaptain3();

    }
}
