package edu.rseymour.java.methodscommontoallobjects;

/**
 * A class that implements Cloneable is expected to provide a properly
 * functioning public clone method.
 *
 * If you are extending a class that uses Cloneable, you have to implement a clone()
 * method. Otherwise, use a copy constructor or copy factory.
 *
 * The clone method acts as a constructor, so it must correctly copy any fields
 * that refer to mutable objects (e.g. arrays). Use recursive clone like the second
 * example below.
 *
 * Immutable classes should never provide a clone method because it is just
 * wasteful copying.
 */
public class Clone implements Cloneable {

    // private final short areaCode, prefix, lineNum;
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // copy constructor
    public Clone (Clone clone) {

    }

    // copy factory
    public static Clone newInstance(Clone clone) {
        // real code here
        return clone;
    }

    /*
    public Clone(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }
*/

    public Clone(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    @Override
    public Clone clone() {
        try {
            Clone result = (Clone) super.clone();
            result.elements = elements.clone();
            return result;
        } catch(Exception e) {
            throw new AssertionError();
        }
    }

    /*
    @Override
    public Clone clone() {
        try {
            return (Clone) super.clone();
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    */

}
