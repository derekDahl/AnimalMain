
package animalmain;

/**
 *
 * @author Derek Dahl
 */
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.List;
//import java.util.*;

/**
 *
 * @author Derek Dahl
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        
        ArrayList<Animal> zoo = new ArrayList<Animal>(); //an array list that will only take Animal objects (maybe create another class called Zoo()
        Scanner animalScanner = new Scanner(System.in); //create new scanner object
        
        System.out.println("Welcome to the animal zoo!"); 
                
        while(true){
            
            System.out.print("Enter an animal: ");
            String animalNameEntry = animalScanner.nextLine(); //sets animalEntry as the animal's name entered by user
            
            Animal animalObject = new Animal(animalNameEntry); //creates new animalObject and passes it the animalNameEntry string arguement
            
            animalObject.setAnimalName(animalNameEntry); //uses the animalNameEntry string to set the animal's name
            animalObject.getAnimalName(); //retrieves animal name
            System.out.println("You have entered animal name: " + animalObject.getAnimalName()); //confirms user input
            System.out.println();
            
            zoo.add(animalObject);
            
            if (count > 1) { //used to skip the try cath block a single time, to avoid empty comparison of objects in the array list
            
            //for loop in go through array list and assign getname method to comparative variable
            try {
                //zoo.add(animalObject); //adds animalObject equaling animalEntry to the zoo. 
                for (int i = 0; i < zoo.size(); i++) {
                    
                    /**
                     * Creates two strings for boolean comparison
                     */
                    String comp1 = zoo.get(i).getAnimalName(); 
                    String comp2 = animalObject.getAnimalName();
                    
                    /**
                     * There is a flaw in the logic that is comparing an object to itself as iteration is performed on the ArrayList
                     */
                    System.out.println(zoo.get(i).getAnimalName());
                    if (comp1.equals(comp2)) { //This ends up being executed no matter what, needs to be fixed
                        System.out.println("This animal is already in the zoo...");
                        System.out.println("Enter 'edit' or 'delete' for the " + animalObject.getAnimalName() + ", or Press any other key to continue: ");
                        String edit = animalScanner.nextLine();
                        /**
                         * Branching logic to select the appropriate method from the Animal class
                         */
                        switch (edit) {
                            case "yes":
                                animalObject.editAnimal();
                                break;
                            case "delete":
                                zoo.remove(i);
                                zoo.remove(animalObject);
                                break;
                            default:
                                break;
                        }
                        
                    }
                }
            } catch (Exception e) {
            }
            //System.out.println(zoo); //(used for testing) prints memory location of each object to make sure I am actually creating new instances
            
            }
        count++;
        }
    }
      
}
    

