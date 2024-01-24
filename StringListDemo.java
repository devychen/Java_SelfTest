
/**
 * Data Structures 2010 / 2011
 * ch07 Array as instance variable example, the demo to run
 * Useful for SelfTest 06
 */

import java.util.*;

public class StringListDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        String answer = "";
        StringList toDoList = new StringList();

        while (!done) {
            System.out.print("Enter an item for the toDo list (q to quit): ");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("q")) {
                done = true;
            } else {
                toDoList.add(answer);
            }
            System.out.println("Your List: " + toDoList);
            System.out.println(toDoList.numElements);
        }
    }
}