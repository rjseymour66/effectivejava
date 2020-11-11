package edu.rseymour.java.enumsannotations;

import java.util.Set;

/**
 * Just becuase an enumerated type is used in sets, does not mean that you
 * have to represent it with bit fields.
 */
public class EnumSetInsteadOfBitFields {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    // public void applyStyles(Set<Style> styles>) {}

}
