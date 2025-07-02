import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pattern {
  public static void process(Object obj) {
    switch (obj) {
      case String s -> System.out.println("String: " + s.toUpperCase());
      case Integer i -> System.out.println("Integer squared: " + (i * i));
      case Double d -> System.out.println("Double value: " + (d * 2));
      case null -> System.out.println("Null value recieved");
      default -> System.out.println("Unknown type: " + obj);
    }
  }
  public static void main(String[] args) {
    process("Animal");
    process(4);
    process(12.5);
    process(null);
  }
}
