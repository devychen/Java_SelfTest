/**
 * Write a program that asks for a name for the character and asks for a point value for each of the three characteristics. However, the total points must be less than 16. If the total exceeds 15, then 5 points are assigned to each characteristic.
 * Sample run:
 * Enter the name of your character: Chortle
 * Enter strength (1-10): 8
 * Enter intelligence (1-10): 4
 * Enter luck (1-10): 6
 * 
 * You have given your character too many points! Default values have been assigned:
 * Chortle [strength: 5, intelligence: 5, luck: 5]
*/

import java.util.*;

public class GameCharacters {
   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the name of your Charater: ");
    String name = keyboard.nextLine();
    System.out.println("Enter strength (1-10): ");
    int strength = keyboard.nextInt();
    System.out.println("Enter intelligence (1-10): ");
    int intelligence = keyboard.nextInt();
    System.out.println("Enter luck (1-10): ");
    int luck = keyboard.nextInt();

    int total = strength + intelligence + luck;

    if(total < 16)
    {
        System.out.println(name + " [strength: " + strength + ", " + 
                            "intelligence: " + intelligence + ", " +
                            "luck: " + luck + "]");
    } else {
        System.out.println("You have given your character too many points! Default values have been assigned:");
        System.out.println(name + " [[strength: 5, intelligence: 5, luck: 5]]");
    }

    keyboard.close();
   } 
}
