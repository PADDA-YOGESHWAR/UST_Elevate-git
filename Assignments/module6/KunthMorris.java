import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KunthMorris {

    // Compute the longest prefix suffix array (LPS) for the pattern
    private static int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix

        for (int i = 1; i < n; ) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Search for the pattern in the given text
    private static void searchHiddenMessage(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] lps = computeLPS(pattern);

        int i = 0; // Index for text[]
        int j = 0; // Index for pattern[]

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Hidden message found at index " + (i - j));
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("innocent_text.txt"));
            StringBuilder textBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
            reader.close();
            String text = textBuilder.toString();

            // Read the hidden message from message_to_find.txt
            BufferedReader messageReader = new BufferedReader(new FileReader("message_to_find.txt"));
            String hiddenMessage = messageReader.readLine();
            messageReader.close();

            searchHiddenMessage(text, hiddenMessage);
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
