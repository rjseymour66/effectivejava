package edu.rseymour.java.generics;

import java.util.Arrays;

/**
 * Eliminate every unchecked warning that you can to eliminate a ClassCastException
 * at runtime.
 */
public class EliminateUncheckedWarnings {

    private String warning;
    private int size;

    public EliminateUncheckedWarnings(String warning) {
        this.warning = warning;
    }

    /**
     * If you can't eliminate the warning but you know that the code is typesafe,
     * use the @SuppressWarnings("unchecked") annotation.
     *
     * Always use the SuppressWarnings annotation on the smallest scale possible. Never use
     * the warning on an entire class.
     *
     * Always include a comment explaining why it is ok to suppress the warning.
     */
/*
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            // This cast is correct because the array we're creating
            // is of the same type as the one passed in, which is T[].
            @SuppressWarnings("unchecked") T[] result =
                    (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
    */
}
