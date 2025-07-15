## Creating a Word Counting Keywords in Java Code:
In Java, this method involves splitting the string into an array of words and then using a HashMap to store the word counts. This method is typically one of the most concise and straightforward approaches, particularly when spaces separate the words:

- The code first takes the input string from the user.
  
- It converts the string to lowercase to ensure case-insensitive counting.

- The split("[\\s.,;!?\"]+") method uses a regular expression to split the string at any occurrence of whitespace or punctuation characters. The + ensures that multiple spaces or punctuation marks are treated as a single delimiter.
  
- A HashMap named wordCounts is used to store each unique word (key) and its corresponding count (value).
  
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;
        
        public class WordCounter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the string:");
                String text = scanner.nextLine();
        
                // Convert to lowercase for case-insensitive counting
                String lowerCaseText = text.toLowerCase(); 
        
                // Split the string into words based on whitespace and punctuation
                String[] words = lowerCaseText.split("[\\s.,;!?\"]+"); // splits by one or more whitespace or punctuation
        
                Map<String, Integer> wordCounts = new HashMap<>(); //
        
                for (String word : words) {
                    if (!word.isEmpty()) { // Ensure not to count empty strings if multiple delimiters were adjacent
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1); //
                    }
                }
        
                // Display the word counts
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
        
                scanner.close();
            }
        }

### Summary:
The code iterates through each character of the input string. You can choose the approach that best suits your needs in terms of complexity, readability, and desired level of control over the word counting process. The String.split() with HashMap approach is a good balance for most situations, while streams offer a more concise solution for Java 8 and newer versions.
