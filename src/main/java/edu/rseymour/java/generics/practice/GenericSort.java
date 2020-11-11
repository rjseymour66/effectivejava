package edu.rseymour.java.generics.practice;

public class GenericSort {
    public static void main(String[] args) {

        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};
        Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};
        String[] stringArray = {"Tom", "Susan", "Kim"};

    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length -1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
        }
    }
}
