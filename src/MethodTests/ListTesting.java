package MethodTests;

import java.util.Iterator;
import java.util.List;

abstract class ListTesting {
    static <T> void assertEquals(String comment, T expected, T actual) {
        assert expected.equals(actual) : printMessageShouldBeEquals(comment, expected, actual);
    }

    static void assertListsEquals(String comment, List expectedList, List actualList) {
        Iterator itExpected = expectedList.iterator();
        Iterator itActual = actualList.iterator();

        assert expectedList.size() == actualList.size() : printMessageShouldBeEquals(comment, expectedList, actualList);

        while (itExpected.hasNext() && itActual.hasNext())
            assert itExpected.next() == itActual.next() : printMessageShouldBeEquals(comment, expectedList, actualList);
    }

    static void assertListsNotEqual(String comment, List expectedList, List actualList) {
        Iterator itExpected = expectedList.iterator();
        Iterator itActual = actualList.iterator();

        boolean equals = expectedList.size() == actualList.size();
        while (itExpected.hasNext() && itActual.hasNext())
            if (itExpected.next() != itActual.next()) {
                equals = false;
                break;
            }

        assert !equals : printMessageShouldNotBeEquals(comment, expectedList, actualList);
    }

    private static <T> String printMessageShouldBeEquals(String comment, T expected, T actual) {
        return printShouldBeSameOrDifferent(comment, expected, actual, true);
    }

    private static <T> String printMessageShouldNotBeEquals(String comment, T expected, T actual) {
        return printShouldBeSameOrDifferent(comment, expected, actual, false);
    }

    private static <T> String printShouldBeSameOrDifferent(String comment, T expected, T actual, boolean shouldBeEqual) {
        return comment + "\nExpected: " + "\u001B[32m" + expected + "\u001B[31m"
                + (shouldBeEqual ? ", should be equal to " : ", should be different than ")
                + "\u001B[30m" + actual + "\u001B[31m";
    }
}
