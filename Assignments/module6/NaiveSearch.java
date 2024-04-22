import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NaiveSearch {
    public static List<Integer> naiveSearch(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                occurrences.add(i); // Add the starting index of the match
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

            List<Integer> occurrences = naiveSearch(text, hiddenMessage);
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
