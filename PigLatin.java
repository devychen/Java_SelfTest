/**
 * PigLatin the user name.
 * Input First + Last name
 * Moving the first letter of the word to the end of the word and adding "ay"
 * Capitalize the first letter of the first and last names - the rest of the name should be lowercase
*/
import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        
        // input full name.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = keyboard.nextLine();
        System.out.println("Enter your last name:");
        String lastName = keyboard.nextLine();

        String ay = "ay"; // "ay" ending

        // extract the first letter of first name and last name, and lowercase it
        char firstLetterFN = Character.toLowerCase(firstName.charAt(0));
        char firstletterLN = Character.toLowerCase(lastName.charAt(0));

        // extract the 2nd letter now new first letter, and uppercase it
        char newfirstLetterFN = Character.toUpperCase(firstName.charAt(1));
        char newfirstLetterLN = Character.toUpperCase(lastName.charAt(1));

        // Store the rest
        String restFN = firstName.substring(2, firstName.length()); // why no "-1"?
        String restLN = lastName.substring(2, lastName.length());
    
        // PigLatin version of full name.
        String newFN = newfirstLetterFN + restFN + firstLetterFN + ay;
        String newLN = newfirstLetterLN + restLN + firstletterLN + ay;

        // Print results.
        System.out.println("You PigLatin full name is:");
        System.out.println(newFN + " " + newLN);

        keyboard.close();

    }
}
