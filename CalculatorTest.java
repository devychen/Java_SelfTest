/**
 * SelfTest 05
 * TKRB
 * The JUnit test for Class Calculator
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    private double result; // NEED?
    public static final double EPSILON = 0.01;

    /**
     * Test default constructor
     */
    @Test
    public void testCalculator(){
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.getResult(), EPSILON);
    }

    /**
     * Test add
     */
    @Test
    public void testadd(){
        Calculator calculator = new Calculator();
        calculator.add(2.0, 1.0);
        assertEquals(3.0, calculator.getResult(), EPSILON);

        calculator.add(1.0);
        assertEquals(4.0, calculator.getResult(), EPSILON);
    }

    /**
     * Test substract
     */
    @Test
    public void testsubstract(){
        Calculator calculator = new Calculator();
        calculator.substract(2.0, 1.0);
        assertEquals(1.0, calculator.getResult(), EPSILON);

        calculator.substract(1.0);
        assertEquals(0.0, calculator.getResult(), EPSILON);
    }

    /**
     * Test multiplication
     */
    @Test
    public void testmult(){
        Calculator calculator = new Calculator();
        calculator.mult(3.0, 2.0);
        assertEquals(6.0, calculator.getResult(), EPSILON);

        calculator.mult(2.0);
        assertEquals(12.0, calculator.getResult(), EPSILON);
    }
    
    /**
     * Test division
     */
    @Test
    public void testdiv(){
        Calculator calculator = new Calculator();
        calculator.div(12.0, 2.0);
        assertEquals(6.0, calculator.getResult(), EPSILON);

        calculator.div(2.0);
        assertEquals(3.0, calculator.getResult(), EPSILON);
    }

    /**
     * Test clear result
     */
    @Test
    public void testclearResult(){
        Calculator calculator = new Calculator();
        calculator.add(3.0, 2.0);
        calculator.mult(2.0);

        calculator.clearResult();
        assertEquals(0.0, calculator.getResult(), EPSILON);
    }
}

