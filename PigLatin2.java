
/**
 * Modify your PigLatin program so that 
 * it reads lines of text (till the end of input) and 
 * translates each word on each line to pig latin, using the following rules:
 * 
 * All of the consonants at the beginning of a word are moved to the end and "ay" is attached
 * If a word begins with a vowel, nothing is moved to the end. Simply attach "lay" to the end.
 * 'y' is not considered a vowel (just 'a', 'e', 'i', 'o', and 'u')
 * Assume that all input is lowercase
 * Assume that the input contains no punctuation.

*/

import java.util.*;

public class PigLatin2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner lineScan;

        System.out.println("Enter the lines of text.");
        System.out.println("All in lowercase, no punctuation: ");

        String line = "";
        String word = "";
        String pigWord = "";

        // Read each line
        while (keyboard.hasNextLine()) {
            line = keyboard.nextLine();
            lineScan = new Scanner(line);

            // Process each word
            while (lineScan.hasNext()) {
                word = lineScan.next();
                char firstChar = word.charAt(0);

                // Check vowels
                if (firstChar == 'a' || firstChar == 'e' || firstChar == 'u' ||
                        firstChar == 'e' || firstChar == 'o') {
                    pigWord = word + "lay";
                } else {
                    pigWord = word.substring(1) + firstChar + "ay";
                }

                System.out.print(pigWord + " ");

            }
            System.out.println();

        }

        keyboard.close();
    }
}

// char[] vowels = {'a', 'e', 'u', 'e', 'o'}; Hasn't learned.