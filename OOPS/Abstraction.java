/*Abstraction means hiding internal implementaion and showing essential features to user. 
It is achieved using the abstraction and interface. */

abstract class Animal {
    // abstract method — no body
    abstract void sound();

    // normal method — has body
    void breathe() {
        System.out.println("All animals breathe");
    }
}

class Dog extends Animal {
    // MUST implement sound()
    void sound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    // MUST implement sound()
    void sound() {
        System.out.println("Cat says: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();      // → Dog says: Woof!
        d.breathe();    // → All animals breathe

        Cat c = new Cat();
        c.sound();      // → Cat says: Meow!
        c.breathe();    // → All animals breathe
    }
}
