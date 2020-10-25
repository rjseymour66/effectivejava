package edu.rseymour.java.classesandinterfaces;

/**
 * Existing classes can easily be retrofitted to implement a new interface by adding an
 * 'implements' clause to the class declaration.
 *
 * Interfaces are ideal for defining mixins.
 * mixin - a type that a class can implement in addition to its primary type. Comparable
 *         allows a class to declare that its instances are ordered with respect to other
 *         comparable objects, so it allows the optional functionality to be mixed in to the
 *         type's primary functionality.
 *
 * You can construct nonhierarchical type frameworks, meaning that you can implement multiple
 * interfaces for a class without creating a separate class for every supported combination of
 * attributes.
 *
 * Skeletal implemenations
 * Define the type, some default methods, and then the skeletal implementation class implements
 * the remaining non-primitive methods on top of the primitive interface methods. This is the
 * 'Template Method' pattern. **Good documentation is necessary.**
 * 1. Decide which methods are the primitives in terms of which the others can be implemented -
 *    these are the abstract methods in the skeletal implementation.
 * 2. Provide default mmethods in the interface for all the methods that can be implemented
 *    directly atop the primitives, but none of the Object methods.
 *
 * Step 1: Create an interface.
 * Step 2: Create an Abstract class that implements that interface and provides the implementation
 *         of common methods.
 * Step 3: In the subclass, create a private inner class, which extends the Abstract class. Now
 *         this class can extend and implement any interfaces while using the common method by
 *         delegating calls to the Abstract class.
 */
public class PreferInterfacesToAbstractClasses {
}
