/* Encapsulation 
Binding data (variables) and methods into a single unit(class) and protecting the data by restricting direct access. 
*/
import java.util.*;
class Speaker {
    private final int volume = 5; // private

    // Getter method for volume
    public int getVolume() {
        return volume;
    }

    // Set the volume for our Use
    public void setVolume(int volume) {
        if(volume >= 5 && volume <= 15) {
            System.out.println("Correct vol for human Hearings: " + volume);
        }
        else {
            System.out.println("It may affect your Hearing: " + volume); 
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Speaker sp = new Speaker();

        // reading volume using getter
        System.out.println("Current Volume: " + sp.getVolume());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the normal Volume: ");
        int vol1 = sc.nextInt();
        System.out.print("Enter the High Volume: ");
        int vol2 = sc.nextInt();

        sc.close();
        
        // Updated vol
        sp.setVolume(vol1);
        // System.out.println("\nUpdated Volume: " + sp.getVolume());

        // trying to set invalid volume
        sp.setVolume(vol2);

        // sp.setVolume(15);

        
    }
}