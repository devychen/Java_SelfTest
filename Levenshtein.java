/**
 * SelfTest 07
 * TKRB
 * 
 * Task: Implement Levenshtein distance algorithm to 
 * measure difference between 2 strings (the lower the similar)
 */

public class Levenshtein {

    private String word1;
    private String word2;
    private int[][] table;

    /**
     * Constructor. 
     * Initializes all instance variables and 
     * creates the table using the static helper method.
     * @param aWord1
     * @param aWord2
     */
    public Levenshtein(String aWord1, String aWord2){

    }

    /**
     * Constructs and returns the table as a two-dimensional integer array. 
     * Should be used in the constructor to create the table. 
     * This is the actual implementation of the algorithm.
     * @param word1
     * @param word2
     * @return
     */
    private static int[][] table(String word1, String word2){
        return null;
    }


    /**
     * calculates (returns) the mathematical minimum of three integer numbers (parameters).
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    private static int min(int i1, int i2, int i3){
        return -1;
    }

    /**
     * Returns the Levenshtein distance between word1 and word2.
     * @return
     */
    public int distance(){
        return - 1;

    }
    
    /**
     * prints table (two-dimensional array). 
     * (optional: print the table with the two words in their correct 
     * positions in the first row and first column respectively.)
     */
    public void printTable(){

    }

}


/*
 * main method which reads two words from the user to compare for their Levenshtein distance 
 * (it should continue to do so until the user enters "q").
 */