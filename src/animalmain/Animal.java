/* Copyright © 2017 To Present Derek Dahl - All Rights Reserved
 * 
 * 
 *
 */

package animalmain;
    
/**
 *
 * @author Derek Dahl
 */

public class Animal {
    
    private String name;
    private String color;
    private boolean moveOnLand, fly, swim;
    private boolean vertibrate;
    private boolean mammal, fish, bird, reptile; 
 
    public Animal(String animalNameEntry) {//constructor that takes animal name as a required arguement
               
    }
    
    //setter method for animal name
    public void setAnimalName(String animalNameEntry) {
        this.name = animalNameEntry;
        
    }
    //getter method for animal name
    public String getAnimalName() {
        return this.name;
        
    }
    //method to edit the animals attributes
    public void editAnimal() {
        System.out.println("Animal editing placeholder");
    }
}
    
    
     


