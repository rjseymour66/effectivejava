package edu.rseymour.java.creatinganddestroyingobjects;

/**
 * This class provides examples of static factory methods using common naming conventions.
 *
 *********************************** Backgound ***********************************
 *
 * Provide static factory methods instead of or along with public constructors. Static factories have the
 * following advantages:
 * 1. They have names, so they are easy to distinguish from each other
 * 2. They don't have to create a new object each time they are called -- they can return the same object. This
 *    is called instance control.
 * 3. They can return a subtype of their return type. You can return objects without making their classes public. This
 *    is useful for interface-based framework.
 * 4. The class of the returned object can vary from call to call as a function of the input parameters.
 * 5. The calls of the returned object does not need to exist when the class containing the method is written.
 *
 * Limitations include:
 * 1. Classes without public or protected constructors cannot be subclassed.
 * 2. They might be hard to find in the documentation because they do not stand out like constructors.
 */
public class StaticFactoryInsteadOfConstructors {

    // takes a single parameter and returns a corresponding instance of the type
    public static StaticFactoryInsteadOfConstructors from(Object instant) {
        return new StaticFactoryInsteadOfConstructors();
    }

    // aggregation method that takes multiple params and returns an instance that incorporates them
    public static StaticFactoryInsteadOfConstructors of(Object one, Object two, Object three) {
        return new StaticFactoryInsteadOfConstructors();
    }

    // alternative to from and of
    public static StaticFactoryInsteadOfConstructors valueOf(Object object) {
        return new StaticFactoryInsteadOfConstructors();
    }

    // returns an instance described by its params
    public static StaticFactoryInsteadOfConstructors getInstance(Object optionalParameters){
        return new StaticFactoryInsteadOfConstructors();
    }
    // like getInstance, but guarantees that each call returns a new instance
    public static StaticFactoryInsteadOfConstructors create(){
        return new StaticFactoryInsteadOfConstructors();
    }

    // like getInstance, but guarantees that each call returns a new instance
    public static StaticFactoryInsteadOfConstructors newInstance() {
        return new StaticFactoryInsteadOfConstructors();
    }

    // getType: used if the factory method is in a different class
    public static StaticFactoryInsteadOfConstructors getStaticFactoryInsteadOfContructors(Object type){
        return new StaticFactoryInsteadOfConstructors();
    }

    // newType: like newInstance and used if the factory method is in a different class
    public static StaticFactoryInsteadOfConstructors newStaticFactoryInsteadOfContructors(Object type){
        return new StaticFactoryInsteadOfConstructors();
    }

    // type: concise alternative to getType and newType. Ex: Collections.list(param)
    public static StaticFactoryInsteadOfConstructors type(Object object){
        return new StaticFactoryInsteadOfConstructors();
    }










}
