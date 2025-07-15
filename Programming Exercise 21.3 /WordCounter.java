import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * After filling the map, stream it and sort: wordCounts.entrySet() stream() sorted(Map.Entry.<String, Integer>comparingByValue() reversed())…
 * Prints a specific message based on the input String type.
 *
 */
public class WordCounter {
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String");
      String input = sc.nextLine().toLowerCase(Locale.ROOT);
      int count=countNumberOfWords(s);
      System.out.println("Number of words in String= "+count)

      // Convert to lowercase for case-insensitive counting
      String lowerCaseText = text.toLowerCase(); 

      // Split the string into words based on whitespace and punctuation
      String[] words = lowerCaseText.split("[\\s.,;!?\"]+"); // splits by one or more whitespace or punctuation
  }

  private static Integer countNumberOfWords(String s) {
    int count=0;
    if(s.charAt(0)!=' ') {
      count++; 
    }

    for (int i=0;i<s.length();i++) {
      if (s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
        count++;
      }
    }
    return count;
  }
}
