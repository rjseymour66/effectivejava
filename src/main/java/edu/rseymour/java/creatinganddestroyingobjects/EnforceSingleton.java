package edu.rseymour.java.creatinganddestroyingobjects;


/**
 * Singleton: class that is instantiated only once (this makes it difficult to test).
 *
 * There are 2 common ways to implement singletons:
 * 1. With a public final field
 * 2. With a static factory
 *
 * Advantages include:
 * - Gives you the flexibility to change your mind about whether the class is a singleton without
 *   changing the API
 * - You can write a generic singleton factory if your application requires it
 * - Method references can be used as a supplier. EnforceSingleton::getInstance
 */
public class EnforceSingleton {

    // public final field
    public static final EnforceSingleton INSTANCE = new EnforceSingleton();
    public EnforceSingleton(){}

    // with a static factory
    private static final EnforceSingleton FACTORY_INSTANCE = new EnforceSingleton();
    // public constuctor here
    public static EnforceSingleton getInstance() { return FACTORY_INSTANCE; }

    // add a readResolve method to make it serializable
    private Object readResolve() {
        // return the true singleton object and
        // let the garbage collector take care of
        // the additional one
        return INSTANCE;
    }

    /**
     * BEST WAY to decalre the singleton as an Enum
     * - concise
     * - provides serialization requirements for fee
     * - multiple instantiation is impossible
     *
     * You cannot use this if your singleton must extend a superclass other
     * than Enum
     */
    public enum Singleton {
        INSTANCE;
    }
}
