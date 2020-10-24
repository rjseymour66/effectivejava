package edu.rseymour.java.classesandinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulation decouples components from systems and allows them to be tested
 * and changed without impacting the overall system.
 *
 * As a rule of thumb, make each class or member as inaccessible as possible.
 *
 * Top-level classes can be package-private or public. If you can make it package-private,
 * do it. This makes it part of the implementation.
 * - if a package-private top-level class or interface is used by 1 class only, consider making it
 *   a private static nested class or the 1 class that uses it.
 *
 * 4 access levels:
 * - private: accessible from top-level class where it is declared
 * - package-private: accessible from any class in the package where it is declared. Also called 'default'
 *   access, this is what you get if you don't explicitly declare an access modifier.
 * - protected: accessible from subclasses of the class where it is declared and from any class in the
 *   same package where it is declared
 * - public: accessible from anywhere. Instance fields of public classes should rarely be public. Same with
 *           static fields, except when they are constants.
 *
 *
 * Key rule: if a method overrides a superclass method, it cannot have a more restrictive access
 *           level than in the superclass.
 *
 * Never make a class, interface, or member more accessible than necessary so that you can test.
 *
 * It is wrong for a class to have a public static final array field - that is a security leak. You can
 * make the array private and add a public immutable list, or make the array private and add a public
 * method that returns a copy of a private array.
 */
public class Accessibility {

    private int rule;
    private String nameOfRule;
    public static final String CONSTANT_VARIABLE = "This is the constant";

    // private array and public immutable list
    private static final Object[] PRIVATE_VALUES = {};
    public static final List<Object> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // private array and public method that returns a copy of private array
    private static final Object[] PRIVATE_VALUES2 = {};
    public static final Object[] values() {
        return PRIVATE_VALUES2.clone();
    }
}
