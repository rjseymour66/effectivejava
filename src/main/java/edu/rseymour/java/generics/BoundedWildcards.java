package edu.rseymour.java.generics;

import java.util.*;

/**
 * PECS:
 * Producer - extends
 * Consumer - consumes
 */
public class BoundedWildcards<T> {

    /**
     * This constructor uses the collectin choices only to produce values of type
     * T and stores them for later use.
     */
    public BoundedWildcards(Collection<? extends T> choices) {

    }

    /**
     * This method is made of producers and lets you create sets that extend the same
     * subtype so that they can be joined together in a set of the super (see the main() below).
     */
    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    /**
     * The list produces T instances, so use extends.
     *
     * Comparables consume instances, so use 'super'. Use Comparable<? super T> instead of
     * Comparable<T>.
     */
    public static<T extends Comparable<? super T>> T max(List<? extends T> c) throws IllegalAccessException {
        if (c.isEmpty())
            throw new IllegalAccessException("Empty collection"); // better option is to return Optional<E>

        T result = null;
        for (T e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    /**
     * Capturing the wildcard type. If the type of list is List ?, you can't put any value
     * other than null into a List ? .
     *
     * The swapHelper method knows the type, so it knows that any type taken out is safe to put back
     * in.
     */
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        Set<Integer> integers = Set.of(1, 3, 5);
        Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
        Set<Number> numbers = union(integers, doubles);
        System.out.println(numbers);
    }
}
