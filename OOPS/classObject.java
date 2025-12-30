// Class and Object 
// classs is a template for objects , where as object is an instance of a class .  We can create obj using new keyword . We can access classs variables and methods using object.

class Sample {
    String name;
    String dept;
    int year;
    String clg;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("College: " + clg);  
    }
}

public class classObject {
    public static void main(String args[]) {
        // Using new keyword to create object for class Sample
        // Sample obj = new Sample();
        Sample obj1 = new Sample();

        // Accessing class variables and method using object
        obj1.name = "Dharun";
        obj1.dept = "IoT";
        obj1.year = 4;           
        obj1.clg = "NANDHA ENGINEERING COLLEGE";
        obj1.display();  // This is Method Call
    }
}
    