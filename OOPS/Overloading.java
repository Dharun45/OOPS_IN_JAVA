// Method Overloading Example
/*Method Overloading is a concept where multiple methods have same name but different parameter within the same class 
and  the method call should be resolved at compile time. */
class Main {
    void calculator() {
        System.out.println("Calculator");
    }

    void calculator(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void calculator(float a, float b, float c) {
        System.out.println("Three Var: " + (a + b + c));
    }

    public String calculator(String str) {
        return "Name: " + str;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Main mm = new Main();
        mm.calculator();
        mm.calculator(5 , 5);
        // mm.calculator("Dharun");
        mm.calculator(1.5 , 1.5 , 1.0);


        System.out.println(mm.calculator("Dharun"));
    }
}