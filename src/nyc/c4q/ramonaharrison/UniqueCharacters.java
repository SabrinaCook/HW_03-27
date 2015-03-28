package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * UniqueCharacters.java
 * Accepts an input string and returns a new string that contains each unique letter from the input string.
 *
 */

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("abbcaabcaa"));
    }

    public static String uniqueCharacters(String s) {
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {          // for each letter in the input string
            if (!s2.contains(s.substring(i, i + 1)))    // checks if the output string already has it
                s2 += s.charAt(i);                      // adds each unique letter to the output string
        }

        return s2;
    }
}
