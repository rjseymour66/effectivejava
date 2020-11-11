package edu.rseymour.java.enumsannotations;

/**
 * Enums have an ordinal method that returns the numerical position of each enum
 * constant in its type.
 *
 * Never derive a value associated with an enum from its ordinal - store it in
 * an instance field instead.
 *
 * This is rarely used, and should be avoided, when possible.
 */
public class InstanceFieldsInsteadOfOrdinals {

    public enum Ensemble {
        SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
        SEXTET(7), SEPTET(8), OCTET(8), DOUBLE_QUARTET(8),
        NONET(9), DECTET(10), TRIPLE_QUARTET(12);

        private final int numberOfMusicians;
        Ensemble(int size) { this.numberOfMusicians = size; }
        public int numberOfMusicians() { return numberOfMusicians; }
    }


}
