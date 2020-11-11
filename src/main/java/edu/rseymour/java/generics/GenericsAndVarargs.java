package edu.rseymour.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Use the @SafeVarargs annotation judiciously. Varargs is a leaky abstraction
 * build on arrays, which have different type rules than generics.
 *
 * Always make sure that the method is typesafe, then annotate it with @SafeVarargs.
 */

public class GenericsAndVarargs {

    /**
     * Takes an arbitrary number of lists as arguments and returns a single list containing
     * the elements of all the input lists in sequence.
     */
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    /**
     * Non-vararg version of the flatten array (throwing an error in the
     * foreach loop)
     */
//    static <T> List<T> flatten2(List<List<? extends T>>... lists) {
//        List<T> result = new ArrayList<>();
//        for (List<? extends T> list : lists)
//            result.addAll(list);
//        return result;
//    }

}
