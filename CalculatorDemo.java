/**
 * SelfTest 05
 * TKRB
 * The Demo for Class Calculator
 */

public class CalculatorDemo {
    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        System.out.println("Add");
        calculator.add(2.0, 1.0);
        System.out.println(calculator.getResult());
        calculator.add(1.0);
        System.out.println(calculator.getResult());

        System.out.println("Substract");
        calculator.substract(2.0, 1.0);
        System.out.println(calculator.getResult());
        calculator.substract(1.0);
        System.out.println(calculator.getResult());

        System.out.println("Multiply");
        calculator.mult(3.0, 2.0);
        System.out.println(calculator.getResult());
        calculator.mult(2.0);
        System.out.println(calculator.getResult());

        System.out.println("Divide");
        calculator.div(12.0, 2.0);
        System.out.println(calculator.getResult());
        calculator.div(2.0);
        System.out.println(calculator.getResult());

        System.out.println("Clear");
        calculator.clearResult();
        System.out.println(calculator.getResult());
    }

}
