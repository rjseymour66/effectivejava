package edu.rseymour.java.creatinganddestroyingobjects;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * This demonstrates how to correctly null out references when they become obsolete.
 *
 * This class models a stack.
 */
public class EliminateObsoleteObjectReferences {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public EliminateObsoleteObjectReferences() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // this is nulling the object reference after it is obsolete
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
