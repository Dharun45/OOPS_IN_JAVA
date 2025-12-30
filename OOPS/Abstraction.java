/*Abstraction means hiding internal implementaion and showing essential features to user. 
It is achieved using the abstraction and interface. */

abstract class Attendance {
    // Create abst method
    abstract void present();
    abstract void absent();

    void College() {
        System.out.println("How we calculate the Students attendace for END SEM");
    }   
}

// Child class giving actual implementation
class SEM1 extends Attendance {

    @Override
    void present() {
        System.out.println("Every student must have above 75% attendance");
    }

    @Override
    void absent() {
        System.out.println("If anyother student have < 75% attendance they will pay fine for that, then only allowed to Exam");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Attendance aa; // Create reference for abst class 

        aa = new SEM1(); 
        aa.College();
        aa.present();
        aa.absent();
        
    }
}

