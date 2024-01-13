
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
        int result = 1;

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
            System.out.println("The result for x^n is: " + result);
        } else {
            System.out.println("Error: Please enter valid values.");
            System.exit(0);
        }

        keyboard.close();

    }

}

/*

for (int i = 1; i <= n; i++): 
这个循环从 i 等于 1 开始，一直执行到 i 等于 n 为止。
这意味着循环会执行 n 次，计算的结果是 x 的 n 次方。

for (int i = 0; i <= n; i++): 
这个循环从 i 等于 0 开始，一直执行到 i 等于 n 为止。
这意味着循环会执行 n + 1 次，计算的结果是 x 的 n + 1 次方。

*/