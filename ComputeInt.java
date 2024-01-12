/**
 * Computes x^n  
 * where  x and n are both integers and n is positive. 
 * Prompt the user for x and n (print an error message and exit the program on bad input).
 * Recall that x0 = 1 for any x.
*/

import java.util.*;

public class ComputeInt {

    public static void main(String[] args) {
    
    // Input
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an integer x: ");
    int x = keyboard.nextInt();
    System.out.println("Enter a positive integer n as the index: ");
    int n = keyboard.nextInt();

    Boolean validValues = (x % 1 == 0) && (n % 1 == 0) && (n >= 0);

    if (validValues)
    {
        int result;
        if (n != 0)
        {
            result = (int) Math.pow(x, n);
        } else
        {
            result = 1;
        }
        System.out.println("The result for x^n is: " + result);
    } 
    else 
    {
        System.out.println("Error: Please enter valid values.");
        System.exit(0);
    }


    keyboard.close();

    }

}
