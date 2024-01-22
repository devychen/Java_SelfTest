/**
 * To reverse a string.
 */

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }
        // store the elements in original order


        // reverse array of chars
        
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        // len-1 is the index of the last element
        // Take length 6 for example:
        // j = 0, i = 5 (the last)
        // j = 1, i = 4; 2-3; 3-2; 4-1; 5-0

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
