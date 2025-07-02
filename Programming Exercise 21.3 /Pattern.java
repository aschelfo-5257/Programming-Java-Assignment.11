/**
 * Demonstrates pattern matching in switch statements (Java 17+).
 * Prints a specific message based on the input object's type.
 */
public class Pattern {

  /**
   * Processes the given object and prints a message based on its type.
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
    process(new Object()); // Shows extensibility
  }
}
