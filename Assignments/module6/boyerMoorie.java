import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class boyerMoorie {
    public static List<Integer> boyerMooreSearch(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        // Preprocess the pattern for bad character rule
        int[] badChar = new int[256];
        for (int i = 0; i < 256; i++) {
            badChar[i] = -1; // Initialize all characters as not found
        }
        for (int i = 0; i < m; i++) {
            badChar[pattern.charAt(i)] = i;
        }

        int shift = 0;
        while (shift <= n - m) {
            int j = m - 1;
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }
            if (j < 0) {
                occurrences.add(shift); // Add the starting index of the match
                shift += (shift + m < n) ? m - badChar[text.charAt(shift + m)] : 1;
            } else {
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
            }
        }

        return occurrences;
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

            List<Integer> occurrences = boyerMooreSearch(text, hiddenMessage);
            if (occurrences.isEmpty()) {
                System.out.println("Pattern not found in the text.");
            } else {
                System.out.println("Pattern found at positions: " + occurrences);
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
}
}
