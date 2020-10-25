package edu.rseymour.java.classesandinterfaces;

/**
 * Nested classes should exist to only serve its enclosing class. There are 4 kinds:
 * 1. static member classes
 *    - ordinary class within another class
 *    - has access to all the enclosing class's members, including private ones
 * 2. nonstatic member classes (inner class)
 *    - each instance of a nonstatic member is associated with an enclosing instance
 *      of its containing class
 * 3. anonymous classes (inner class)
 *    - has no name, is declared and instantiated at the point of use
 *    - mostly replaced by lambdas
 * 4. local classes (inner class)
 *    - declared anywhere a local variable is declared and has the same scoping rules
 *    - have names and can be used repeatedly
 *    - have enclosing instances only if they are defined in a nonstatic context
 *    - cannot contain static members
 *    - should be kept short
 *
 *
 */
public class FavorStaticMemberClassesOverNonstatic {
}
