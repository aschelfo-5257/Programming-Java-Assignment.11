## Pattern Matching:
In Java, the method of Pattern Matching refers to the language constructs and syntax that enable you to check an object’s type (or structure) and, if it matches, extract the relevant data directly within the same expression or block. Pattern matching is not a single method or function, but a feature embedded in the syntax of certain constructs, primarily:

    static String formatter(Object obj) {
      return switch (obj) {
          case Integer i -> String.format("int %d", i);
          case Long l    -> String.format("long %d", l);
          case String s  -> String.format("String %s", s);
          default        -> obj.toString();
      };
    }

In essence, Pattern matching is an evolving feature in Java, available for the instanceof operator, switch statements, and (in preview) with records and arrays. It makes code more concise and type-safe when working with different types or object structures.
