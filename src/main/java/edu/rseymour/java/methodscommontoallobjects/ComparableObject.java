package edu.rseymour.java.methodscommontoallobjects;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

/**
 * When you implement a value class that can be ordered, you should implement the
 * Comparable interface so that its instances can be sorted, searched, and used in
 * comparison-based collections.
 *
 * Not declared in object - it is the only method in the comparable interface.
 *
 * Compares one object to another to determine order. Returns the following:
 *   1 if >
 *   0 if ==
 *  -1 if <
 *
 * Can throw an exception if the objects being compared are of different types.
 *
 * Comparator class has a number of construction methods (see lexicographic ordering
 * on example 3).
 */
public class ComparableObject implements Comparable<ComparableObject> {

    private final short areaCode, prefix, lineNum;
    private String s;

    public ComparableObject(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    // compareTo 1
//    public int compareTo(ComparableObject comparable) {
//        return String.CASE_INSENSITIVE_ORDER.compare(s, comparable.s);
//    }

    // compareTo 2
//    public int compareTo(ComparableObject comp) {
//        int result = Short.compare(areaCode, comp.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, comp.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, comp.lineNum);
//        }
//        return result;
//    }

    // compareTo 3 - using Comparator class construction methods
    private static final Comparator<ComparableObject> COMPARATOR =
            comparingInt((ComparableObject comp) -> comp.areaCode)
            .thenComparingInt(comp -> comp.prefix)
            .thenComparingInt(comp -> comp.lineNum);

    public int compareTo(ComparableObject comparableObject) {
        return COMPARATOR.compare(this, comparableObject);
    }
}
