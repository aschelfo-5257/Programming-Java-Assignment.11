import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.Comparator;
/**
 * After filling the map, stream it and sort: wordCounts.entrySet() stream() sorted(Map.Entry.<String, Integer>comparingByValue() reversed())…
 * Prints a specific message based on the input String type.
 *
 */
public class WordCounter {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.nextLine().toLowerCase(Locale.ROOT);

        int count = countNumberOfWords(input);
        System.out.println("Number of words in string = " + count);

      // Split the string into words
        String[] words = input.split("[\\s.,;!?\"']+");

        // Count word frequencies
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Print sorted word counts
        System.out.println("\nWord frequencies (sorted):");
        wordCounts.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

  private static int countNumberOfWords(String s) {
        if (s == null || s.isBlank()) return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
}
