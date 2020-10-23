package edu.rseymour.java.methodscommontoallobjects;

/**
 * The toString() method should return all of the interesting information
 * contained in the object.
 * toString() makes your class much more pleasant to use and debug. If you
 * specifiy the format, people will use it and parse it. If you don't specify
 * the format, then you can change it in future implementations.
 *
 * Either way, clearly document your intentions and either explain the format or
 * the fact that you might change the format in the future.
 *
 * Always provide accessors for the information in toString(), or programmers HAVE
 * to parse this method.
 *
 * You should write a toString() for abstract class whose subclasses share a common
 * string representation.
 */
public class ToString {

    private final short areaCode, prefix, lineNum;

    public ToString(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                '}';
    }
}
