package edu.rseymour.java.methodscommontoallobjects;

/**
 * You must override hashcode in every class that overrides Equals().
 * The hashcode contract is as follows:
 * - hashcode must return the same value each time it is called for the
 *   same object
 * - if 2 objects are equal according to .equals(), they must return the
 *   same hashcode
 * - if 2 objects are unequal according to the .equals() method, .hashcode()
 *   does NOT have to produce distinct result.
 */
public class HashCode {

    private final short areaCode, prefix, lineNum;

    public HashCode(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public int hashCode() {
        int result = Short.hashCode(areaCode);
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        return result;
    }
}
