import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        String name1= new String("Alice");
        String name2= new String("Bob");
        // call the compute() method on that new object

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals(name1)) {
            System.out.println("Hello, " + name1 + "!");
        }
        else if (name.equals(name2)) {
            System.out.println("Hello, " + name2 + "!");
        }
        else{
            System.out.println("You are neither Alice nor Bob.");
        }
    }

    public void compute() {
        // Get input string of name from user

        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
