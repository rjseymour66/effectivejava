package edu.rseymour.java.methodscommontoallobjects;

/**
 * Override the equals method to determine logical equality of value classes, except
 * for classes that use the singleton. Perform the following checks:
 * 1. Use the == operator to check if the argument is a reference to this object
 * 2. Use the instanceof operator to check if the argument has the correct type
 * 3. Cast the argument to the correct type
 * 4. For each significant field in the class, check if that field of the argument
 *    matches the corresponding field of this object.
 *
 * The equals method uses the following properties to implement an equivalence relation:
 * - Reflexive: for non-nulls reference values, x, x.equals(x) must return true
 * - Symmetric: for non-null reference values x and y, x.equals(y) must return true
 *   iff y.equals(x) returns true
 * - Transitive: for non-null reference values x, y, and z, if x.equals(y) returns true
 *   and y.equals(z) rturns true, then x.equals(z) must return true.
 * - Consisent: for non-null reference values x and y, x.equals(y) must return true
 *   every time it is called.
 * - For non-null reference values x, x.equals(null) must return false.
 *
 * You must override hashcode in every class that overrides Equals()
 *
 * Do NOT override equals if any of the following are true:
 * - each instance of the class is inherently unique (Threads)
 * - there is no need for the class to provide a logical equality (Patterns)
 * - a superclass has already overridden it, and it works for the current class
 * - the class is private or package private and you'll never need it
 */

public class Equals {

    private final short areaCode, prefix, lineNum;

    public Equals(short number, short prefix, short lineNum) {
        this.areaCode = number;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Equals))
            return false;
        Equals eq = (Equals)o;
        return eq.areaCode == areaCode && eq.prefix == prefix
                && eq.lineNum == lineNum;
    }
}
