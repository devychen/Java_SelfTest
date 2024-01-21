import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A JUnit test case class for the Purse class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class PurseTest
{    
    public static final double EPSILON = 0.01;
    
    /**
     * Test the AddOneCentCoins method.
     */
    @Test
    public void testAddOneCentCoins() // test method name, return type
    {
        // an IV of 'Purse' Class is created and assigned to variable 'myPurse'
        // The test creates a new Purse object and 
        // asserts that the value returned by the getTotal method is 0, 
        // with an error margin of EPSILON.
        // assertEquals(double expected, double actual, double delta) SYNTAX

        Purse myPurse = new Purse(); 
        
        // ensure default.
        assertEquals(0, myPurse.getTotal(), EPSILON); 
        
        // ensure handle one coin correctly.
        myPurse.addOneCentCoins(1); // add 1 cent = 0.01 dollar
        assertEquals(0.01, myPurse.getTotal(), EPSILON); // expect 0.01
        
        // ensure handle multple coins correctly.
        myPurse.addOneCentCoins(100); // add 1 dollar
        assertEquals(1.01, myPurse.getTotal(), EPSILON); // expect 1
    }
    
    /**
     * Test the AddTenCentCoins method.
     */
    @Test
    public void testAddTenCentCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addTenCentCoins(1);
        assertEquals(0.10, myPurse.getTotal(), EPSILON); 
        
        myPurse.addTenCentCoins(100);
        assertEquals(10.10, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddFiftyCentCoins method.
     */
    @Test
    public void testAddFiftyCentCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addFiftyCentCoins(1);
        assertEquals(0.50, myPurse.getTotal(), EPSILON); 
        
        myPurse.addFiftyCentCoins(100);
        assertEquals(50.50, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddOneEuroCoins method.
     */
    @Test
    public void testAddOneEuroCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addOneEuroCoins(1);
        assertEquals(1.00, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneEuroCoins(100);
        assertEquals(101.00, myPurse.getTotal(), EPSILON); 
    }
}
