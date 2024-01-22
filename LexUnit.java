/**
 * SelfTest 06
 * TKRB
 * Create a class LexUnit (lexical unit) to contain information
 * about a word itself and its synonyms.
 */

public class LexUnit {
    
    private String wordForm;
    private String[] synonyms; // array IV, list of synonyms
    private int numSynonyms; // number of current synonyms in the list

    public int INITIAL_SIZE = 3;

    /**
     * Default constructor, so that
     * LexUnit has no wordForm, no synonyms.
     */
    public LexUnit(){
        wordForm = "";
        synonyms = new String[INITIAL_SIZE];
        numSynonyms = 0;
    }

    /**
     * Constructor to initialise Instance Variable, so that
     * LexUnit has given wordForm, but no synonyms.
     * @param wordForm
     */
    public LexUnit(String wordForm){
        this();// ???
        setWordForm(wordForm); //???
    }

    /**
     * Get the word form.
     * @return the wordForm for this LexUnit
     */
    public String getWordForm(){
        return wordForm;
    }

    /**
     * Set the wordForm for this LexUnit
     * @param wordForm
     */
    public void setWordForm(String wordForm){
        this.wordForm = wordForm; // ???
    }

    /**
     * Get the synonyms for this LexUnit
     * Get a copy of the used portion of the synonym array (???)
     * @return an array of synonyms for this LexUnit; 
     */
    public String[] getSynonyms(){  //???
        String[] rval = new String[numSynonyms];  // create a new string array rval whose size is 'numSynonyms'
        for (int i = 0; i < numSynonyms; i++){    // loop and copy every synonyms
            rval[i] = synonyms[i];                // from original string array 'synonyms' to new 'rval'
        }
        return rval;
    }

    /**
     * Get the number of synonyms for this LextUnit
     * @return the number of synonyms for this LexUnit
     */
    public int getNumSynonyms(){
        return numSynonyms;
    }

    /**
     * Add aSynonym to this LexUnit's synonyms; 
     * if the array is not big enough to hold another element, 
     * resize the array before adding
     * @param aSynonym
     */
    public void addSynonym(String aSynonym){
        if (numSynonyms == synonyms.length){
            String[] tmp = new String[INITIAL_SIZE + numSynonyms]; // ???
            for (int i = 0; i < numSynonyms; i++){
                tmp[i] = synonyms[i];
            }
            synonyms = tmp;
        }
        // add aSynonym (???)
        synonyms[numSynonyms] = aSynonym;
        numSynonyms++;
    }

    /**
     * Generate and return a String containing 
     * the word form, 
     * the number of synonyms, 
     * and the synonyms
     */
    public String toString(){
        String rval = wordForm + ":";
        for (int i = 0; i < numSynonyms; i++){
            rval += " " + synonyms[i];          // !!!
        }
        return rval;
    }



}
