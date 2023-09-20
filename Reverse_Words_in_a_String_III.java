import java.util.*;
public class Main {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");  // Split the sentence into words using space as the delimiter
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append it to the result StringBuilder
            result.append(reverseWord(word)).append(" ");
        }

        // Remove the trailing space and return the result as a string
        return result.toString().trim();
    }

    // Helper function to reverse a word
    private static String reverseWord(String word) {
        char[] wordChars = word.toCharArray();
        int left = 0;
        int right = wordChars.length - 1;

        while (left < right) {
            char temp = wordChars[left];
            wordChars[left] = wordChars[right];
            wordChars[right] = temp;
            left++;
            right--;
        }

        return new String(wordChars);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input =sc.nextLine();  // Example input sentence
        String reversed = reverseWords(input);
        System.out.println(reversed);  // Output: "s'teL edoc ni avaJ"
    }
}
