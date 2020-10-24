package edu.rseymour.java.classesandinterfaces;

/**
 * Immutable objects stay in the state that you created it in. They are also thread-safe,
 * and require no synchronization. Try not to write a setter for every getter.
 *
 * Rules:
 * 1. Don't provide methods that modify the object's state (mutators)
 * 2. Ensure that the class can't be extended - make all the constructors private or
 *    package-private and add public static factories in place of the public constructors
 * 3. Make all fields final
 * 4. Make all fields private
 * 5. Ensure exclusive access to any mutable components
 *
 * functional approach - methods return the result of applying a function to their
 *                       operand without modifying it
 * imperative/procedural approach - methods apply a procedure to their operand, causing
 *                                  its state to change.
 *
 * This class represents a complex number with both real and imaginary parts.
 *
 * You can use static factories to reuse instances when existing ones work.
 * Do not provide a clone method or copy constructor.
 *
 * Serializability: if the class implements Serializable and contains one or more fields that
 * refer to mutable objects, you must provide one of the following:
 * - readObject || readResolve method
 * - ObjectOutputStream.writeUnshared || ObjectInputStream.readUnshared
 */
public class MinimizeMutability {

    private final double re;
    private final double im;

    // static factories instead of public constructors
    private MinimizeMutability(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // static factory
    public static MinimizeMutability valueOf(double re, double im) {
        return new MinimizeMutability(re, im);
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    // functional approach - methods return the result of applying a
    // function to their operand without modifying it
    // use prepositions instead of verbs bc the object is not modified
    public MinimizeMutability plus(MinimizeMutability c) {
        return new MinimizeMutability(re + c.re, im + c.im);
    }

    // functional approach - methods return the result of applying a
    // function to their operand without modifying it
    // use prepositions instead of verbs bc the object is not modified
    public MinimizeMutability minus(MinimizeMutability c) {
        return new MinimizeMutability(re - c.re, im - c.im);
    }

    // functional approach - methods return the result of applying a
    // function to their operand without modifying it
    // use prepositions instead of verbs bc the object is not modified
    public MinimizeMutability times(MinimizeMutability c) {
        return new MinimizeMutability(re * c.re - im * c.im,
                                      re * c.im + im * c.re);
    }

    // functional approach - methods return the result of applying a
    // function to their operand without modifying it
    // use prepositions instead of verbs bc the object is not modified
    public MinimizeMutability divideBy(MinimizeMutability c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new MinimizeMutability((re * c.re + im * c.im) / tmp,
                                      (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MinimizeMutability))
            return false;
        MinimizeMutability m = (MinimizeMutability) o;

        // use .compare for floats and doubles, instead of ==
        return Double.compare(m.re, re) == 0
                && Double.compare(m.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
