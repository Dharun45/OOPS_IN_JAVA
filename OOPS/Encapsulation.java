/* Encapsulation 
Binding data (variables) and methods into a single unit(class) and protecting the data by restricting direct access. 
*/
/* The rule is simple: make fields private, expose them through public getters and setters.
Why it matters:
Protects data from unintended modification
Gives you control over what gets in and out
Makes the code maintainable and secure */

class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }
   public void setIdNum( String newId) {
      idNum = newId;
   }
}

public class RunEncap {
   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}
