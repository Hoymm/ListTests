package MethodTests;

import java.util.Iterator;
import java.util.List;

abstract class ListTesting {
    static <T> void assertEquals(String comment, T expected, T actual) {
        assert expected.equals(actual) : printMessageNotEquals(comment, expected, actual);
    }

    static void assertListsEquals(String comment, List expectedList, List actualList) {
        Iterator itExpected = expectedList.iterator();
        Iterator itActual = actualList.iterator();

        assert expectedList.size() == actualList.size() : printMessageNotEquals(comment, expectedList, actualList);
        while (itExpected.hasNext() && itExpected.hasNext())
            assert itExpected.next() == itActual.next() : printMessageNotEquals(comment, expectedList, actualList);
    }

    private static <T> String printMessageNotEquals(String comment, T expected, T actual) {
        return comment +  "\nExpected list: " + "\u001B[32m" + expected + "\u001B[31m" +", Actual list: "
        + "\u001B[30m" + actual + "\u001B[31m";
    }
}
