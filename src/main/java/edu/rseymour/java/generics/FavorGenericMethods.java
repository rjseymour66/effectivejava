package edu.rseymour.java.generics;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.UnaryOperator;

/**
 * Generic methods are safer and easier to use because they don't require casts.
 */

public class FavorGenericMethods {

    // Generic singleton factory pattern
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    /**
     * One limitation of this is that the types of the input params and return Sets must all be
     * the same. You can change this with bounded wildcard types.
     */
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // Using a recursive type bound to express mutual comparatablity
    public static<E extends Comparable<E>> E max(Collection<E> c) throws IllegalAccessException {
        if (c.isEmpty())
            throw new IllegalAccessException("Empty collection"); // better option is to return Optional<E>

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<String> stooges = Set.of("Larry", "Curly", "Moe");
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);

        String[] strings = { "jute", "hemp", "nylon" };
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}
