
/**
 * StringBuffer example program.
 * 
 * About StringBuffer and String Builder:
 * They are sibling class, offer the same funcionallity. 
 * StringBuffer is thread safe and synchronized whereas StringBuilder is not.
 * Thus StringBuilder is faster.
 * 
 * Documentation:
 * https://docs.oracle.com/javase/tutorial/java/data/buffers.html 
 */

 import java.util.concurrent.TimeUnit;

public class StringCat {
    private static String[] words = {
            "Das",
            "ist",
            "ein",
            "völlig",
            "nutzloser",
            "Satz",
            "um",
            "einen",
            "anderen",
            "nutzlosen",
            "Satz",
            "zu",
            "erzeugen"
    };

    public static String catWithString(int iterations) {
        String ret = "";
        for (int outer = 0; outer <= iterations; outer++) {
            for (int inner = 0; inner < words.length; inner++) {
                ret += words[inner] + " ";
            }
        }

        return ret;
    }

    public static String catWithStringBuilder(int iterations) {
        // StringBuilder ret = new StringBuilder(); // StringBuffer, same functionallity
        // but thread safe
        StringBuffer ret = new StringBuffer();
        for (int outer = 0; outer <= iterations; outer++) {
            for (int inner = 0; inner < words.length; inner++) {
                ret.append(words[inner]);
                ret.append(" ");
            }
        }

        return ret.toString();
    }

    public static void areStringsEqual() {
        String s1 = new String("Hallo");
        String s2 = s1;
        boolean b1 = s1 == s2;
        s1 += " world";
        boolean b2 = s1 == s2;
        System.out.println("b1:" + b1 + "; b2:" + b2);
    }

    public static void main(String[] args) {
        long cvsStartTime = System.nanoTime();
        String cvs = catWithString(10000);
        long cvsEndTime = System.nanoTime();

        long cvsElapsedTime = (cvsEndTime - cvsStartTime);
        double cvsElapsedTimeInSeconds = TimeUnit.MILLISECONDS.convert(cvsElapsedTime, TimeUnit.NANOSECONDS) / 1000.0;
        System.out.println("Duration of catWithString: " + String.format("%-4f", cvsElapsedTimeInSeconds) + " seconds");

        long cvsbStartTime = System.nanoTime();
        String cvsb = catWithStringBuilder(10000);
        long cvsbEndTime = System.nanoTime();

        long cvsbElapsedTime = (cvsbEndTime - cvsbStartTime);
        double cvsbElapsedTimeInSeconds = TimeUnit.MILLISECONDS.convert(cvsbElapsedTime, TimeUnit.NANOSECONDS) / 1000.0;
        System.out.println(
                "Duration of catWithStringBuilder: " + String.format("%-4f", cvsbElapsedTimeInSeconds) + " seconds");

        System.out.print("Generated Strings are ");
        if (cvs.equals(cvsb)) {
            System.out.println("equal.");
        } else {
            System.out.println("not equal.");
        }
    }

    /*
     * public static void main(String[] args) {
     * areStringsEqual();
     * }
     */
}