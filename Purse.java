/**
 * A class to simulate a coin purse that can hold
 * one-euro, fifty-cent, ten-cent, and one-cent coins.
 * 
 * We want to be able to add coins to a Purse, 
 * get the total value of the coins in a Purse, and to 
 * get a String representation of a Purse 
 * (a String object indicating how many of each coin 
 * denomination are contained in the purse and their total value).
 */
public class Purse 
{
    // Coin value constants
    public static final double ONE_EURO_VALUE = 1.0;
    public static final double FIFTY_CENT_VALUE = .50;
    public static final double TEN_CENT_VALUE = .10;
    public static final double ONE_CENT_VALUE = .01;
    
    // Instance variables for number of each coin denomination面值
    private int numOneEuro; // 1
    private int numFiftyCent; // 0.5
    private int numTenCent; // 0.1
    private int numOneCent; // 0.01
    
    /**
     * Construct an empty Purse
     */
    public Purse()
    {
        numOneEuro = numFiftyCent = numTenCent = numOneCent = 0;
    }
    
    /**
     * Add count one-cent coins to this purse
     * @param count the number of one-cent coins to add
     */
    public void addOneCentCoins(int count)
    {
        numOneCent += count;
    }
    
    /**
     * Add count ten-cent coins to this purse
     * @param count the number of ten-cent coins to add
     */
    public void addTenCentCoins(int count)
    {
        numTenCent += count;
    }
    
    /**
     * Add count fifty-cent coins to this purse
     * @param count the number of fifty-cent coins to add
     */
    public void addFiftyCentCoins(int count)
    {
        numFiftyCent += count;
    }
    
    /**
     * Add count one-euro coins to this purse
     * @param count the number of one-euro coins to add
     */
    public void addOneEuroCoins(int count)
    {

        numOneEuro += count;
    }
    
    /**
     * Determine the total value of all the coins
     * in this purse
     * @return the total value of the coins in this Purse
     */
    public double getTotal()
    {
        return ONE_CENT_VALUE * numOneCent +
                FIFTY_CENT_VALUE * numFiftyCent +
                TEN_CENT_VALUE * numTenCent +
                ONE_CENT_VALUE * numOneCent;
    }
    
    /**
     * Get a String representation of this Purse
     * @return a String representation of this Purse
     */
    public String toString()
    {
        String statement = "";
        statement = "There are " + numOneCent + " one-cent coins;\n" +
                    numTenCent + " ten-cent coins;\n" +
                    numFiftyCent + " fifty-cent coins;\n" +
                    numOneEuro + " one-euro coins in the purse.\n" +
                    "The total value is " +  getTotal() + " euros.";
        ;
        return statement ;
    }
}