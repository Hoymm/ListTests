package MethodTests;

import java.util.List;

abstract class ListTesting {
    static <T> void assertEquals(String comment, T expected, T actual) {
        assert expected.equals(actual) :
                "\u001B[31m" + comment + " Expected value: " + "\u001B[32m" + expected + "\u001B[31m"
                        + ", retrieved: " + "\u001B[30m" + actual + "\u001B[31m";
    }

    static <T> void assertListsEquals(String comment, List expected, List actual) {
        for (int i = 0; i < expected.size(); ++i){
            assert actual.get(i) == expected.get(i)
                    : (comment +  "\nExpected : " + "\u001B[32m" + expected + "\u001B[31m" +", Actual: "
                    + "\u001B[30m" + actual + "\u001B[31m");
        }
    }
}
