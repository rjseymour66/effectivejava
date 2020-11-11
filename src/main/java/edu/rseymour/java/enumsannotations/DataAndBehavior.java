package edu.rseymour.java.enumsannotations;

/**
 * Enums are classes that export one instance for each enumeration constant via a public static final field. Enums
 * are final because they do not have constructors.
 *
 * To associate data with enum constants, declare instance fields and writee a constructor
 * that takes the data and stores it in the fields. All fields should be final.
 *
 * If an enum is generally useful, make it a top-level class. If it is tied to a specific top-level class,
 * make it a member of that class.
 *
 * Use enums any time that you need a set of constants whose members are known at compile time.
 */

public class DataAndBehavior {

    // Enum type with data and behavior
    public enum Planet {
        MERCURY (3.302e+23, 2.439e6),
        VENUS   (4.869e+24, 6.052e6),
        EARTH   (5.975e+24, 6.378e6),
        MARS    (6.419e+23, 3.393e6),
        JUPITER (1.899e+27, 7.149e7),
        SATURN  (5.685e+26, 6.027e7),
        URANUS  (8.683e+25, 2.556e7),
        NEPTUNE (1.024e+26, 2.477e7);

        private final double mass;
        private final double radius;
        private final double surfaceGravity;

        // universal gravity constant in m^3
        private static final double G = 6.67300E-11;

        // Constructor
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            surfaceGravity = G * mass / (radius * radius);
        }

        public double mass()            { return mass; }
        public double radius()          { return radius; }
        public double surfaceGravity()  { return surfaceGravity; }

        public double surfaceWeight(double mass) {
            return mass * surfaceGravity;
        }
    }
}
