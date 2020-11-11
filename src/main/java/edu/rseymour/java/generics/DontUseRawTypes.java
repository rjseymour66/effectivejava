package edu.rseymour.java.generics;

import java.util.Set;

/**
 * Do not use raw types because they do not allow for type safety. They primarily exist
 * for compatibility with legacy code.
 */
public class DontUseRawTypes {

    private String name;
    private int age;

    public DontUseRawTypes(String name) {
        this.name = name;
    }

    // Generic type information is erased at runtime, so you cannot use instanceof on
    // parameterized types other than unbounded wildcard types. Use it with a raw type
    // and then cast it:
    public static void legitimateUseOfRawType(Object o) {
        if (o instanceof Set) {
            Set<?> s = (Set<?>) o;
        }
    }

}
