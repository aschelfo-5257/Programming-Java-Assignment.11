/*
 * Demonstrates pattern matching in switch statements (Java 17+).
 * This class provides a static method to process different types of objects
 * and prints a message based on their runtime type.
 */
public class Pattern {

  /*
   * Processes the given object using pattern matching in a switch statement.
   * <p>
   * - If the object is a {@link String}, prints the string in uppercase.<br>
   * - If the object is an {@link Integer}, prints its square.<br>
   * - If the object is a {@link Double}, prints double its value.<br>
   * - If {@code null}, prints a message indicating a null value.<br>
   * - Otherwise, it prints a message for unknown types.
   * </p>
   * @param obj the object to process; can be String, Integer, Double, null, or other types
   */
  public static void process(Object obj) {
    switch (obj) {
      case String s -> System.out.println("String: " + s.toUpperCase());
      case Integer i -> System.out.println("Integer squared: " + (i * i));
      case Double d -> System.out.println("Double value: " + (d * 2));
      case null -> System.out.println("Null value received");
      default -> System.out.println("Unknown type: " + obj);
    }
  }

  /*
   * The entry point of the program.
   * Demonstrates the {@link #process(Object)} method with various object types.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    process("Animal");
    process(4);
    process(12.5);
    process(null);
  }
}
