/**
 * SelfTest 05
 * Takarabe
 * A Calculator class that can add, substract, multiply, and divide
 * And also keep track of the accumulated results of calculations.
 */
public class Calculator {

    private double result;

    /**
     * Default constructor
     */
    public Calculator() {
        result = 0;
    }

    /**
     * A constructor that takes one double parameter and sets the result
     * 
     * @param parameter One double parameter
     */
    public Calculator(double parameter) {
        result = parameter;
    }

    /**
     * A method to get the result
     * 
     * @return the result
     */
    public double getResult() {
        return result;
    }

    /**
     * A method to clear the result
     * 
     */
    public void clearResult() {
        result = 0.0;
    }

    /**
     * 2 methods for each operation
     * (add, substract, mult, div)
     * One that takes 2 double parameters and resets result
     * One that rakes 1 double parameter and uses as one of the operands
     */

    /**
     * Operation add
     * 
     * @param parameter1 one double parameter
     * @param parameter2 another double parameter
     */
    public void add(double parameter1, double parameter2) {
        result = parameter1 + parameter2;
    }

    public void add(double parameter) {
        result += parameter;
    }

    /**
     * Opeartion substraction
     * 
     * @param parameter1
     * @param parameter2
     */
    public void substract(double parameter1, double parameter2) {
        result = parameter1 - parameter2;
    }

    public void substract(double parameter) {
        result -= parameter;
    }

    /**
     * Operation multiplicaition
     * 
     * @param parameter1
     * @param parameter2
     */
    public void mult(double parameter1, double parameter2) {
        result = parameter1 * parameter2;
    }

    public void mult(double parameter) {
        result *= parameter;
    }

    /**
     * Operation division
     * 
     * @param parameter1
     * @param parameter2
     */
    public void div(double parameter1, double parameter2) {
        result = parameter1 / parameter2;
    }

    public void div(double parameter) {
        result /= parameter;
    }

}
