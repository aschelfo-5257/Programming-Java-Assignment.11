/**
 * Demonstrates pattern matching in switch statements (Java 17+).
 * Prints a specific message based on the input object's type.
 *
 * Requires Java 17 or newer for pattern matching in switch statements.
 */
public class Pattern {

  /**
   * Processes the given object and prints a message based on its type.
   */
  public static void process(Object obj) {
    if (obj == null) {
      System.out.println("Null value received");
    } else if (obj instanceof String) {
      String s = (String) obj;
      System.out.println("String: " + s.toUpperCase());
    } else if (obj instanceof Integer) {
      Integer i = (Integer) obj;
      System.out.println("Integer squared: " + (i * i));
    } else if (obj instanceof Double) {
      Double d = (Double) obj;
      System.out.println("Double value: " + (d * 2));
    } else {
      System.out.println("Unknown type: " + obj);
    }
  }

  /**
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
