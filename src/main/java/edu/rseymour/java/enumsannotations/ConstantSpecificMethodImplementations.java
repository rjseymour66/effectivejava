package edu.rseymour.java.enumsannotations;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class ConstantSpecificMethodImplementations {

    public enum Operation {
        PLUS ("+") {public double apply(double x, double y) {return x + y; }},
        MINUS ("-") {public double apply(double x, double y) {return x - y; }},
        TIMES ("*"){public double apply(double x, double y) {return x * y; }},
        DIVIDE ("/") {public double apply(double x, double y) {return x / y; }};

        private final String symbol;

        Operation(String symbol) { this.symbol = symbol; }

        @Override
        public String toString() { return symbol; }

        public abstract  double apply(double x, double y);

        /**
         * Enums have a valueOf(String) method that translates a constant's name
         * into the constant itself.
         *
         * If you override toString(), consider writing a fromString method to translate
         * it back into an enum.
         */
        private static final Map<String, Operation> stringToEnum =
                Stream.of(values()).collect(
                        toMap(Object::toString, e -> e));

        public static Optional<Operation> fromString(String symbol) {
            return Optional.ofNullable(stringToEnum.get(symbol));
        }

        /**
         * Swithces on enums are good for augmenting enumm types with constant-specific
         * behavior.
         */
        public static Operation inverse(Operation op) {
            switch(op) {
                case PLUS:  return Operation.MINUS;
                case MINUS:  return Operation.PLUS;
                case TIMES:  return Operation.DIVIDE;
                case DIVIDE:  return Operation.TIMES;

                default: throw new AssertionError("Unknown op: " + op);
            }
        }
    }
}
