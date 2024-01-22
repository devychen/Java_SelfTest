/**
 * Example program to convert a StringBuilder to String
 */

public class StringBuilderConvert{
    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello, ");

        // Append more text
        sb.append("World!");

        // Convert StringBuilder to String
        String str = sb.toString();

        // Display the original StringBuilder content
        System.out.println("Original StringBuilder: " + sb);

        // Perform some String operations (e.g., toUpperCase) on the converted String
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseStr);

        // Convert the String back to a StringBuilder
        StringBuilder newStringBuilder = new StringBuilder(str);

        // Display the new StringBuilder content
        System.out.println("Converted StringBuilder: " + newStringBuilder);
    }
}
