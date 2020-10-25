package edu.rseymour.java.classesandinterfaces;

/**
 * 1. The class must document its self-use of overridable (nonfinal and either public or
 *    protected) methods, in what sequence, and how the results of each invocation affect
 *    subsequent processing.
 * 2. The only way to test a class designed for inheritance is to write subclasses.
 * 3. Constructors must not invoke overridable methods
 * 4. If you implement Cloneable in a class that is designed for inheritance,
 *    neither clone nor readObject may invoke an overridable method, directly or indirectly
 * 5. If you implement Serializable in a class that is designed for inheritance, you must
 *    make readResolve or writeReplace protected rather than private.
 *
 * PROHIBITING inheritance
 * 1. Declare the class final
 * 2. Make all the constructors private or package-private and add public static factories in
 *    place of constructors
 */
public final class DesignAndDocumentForInheritanceOrProhibitIt {
}
