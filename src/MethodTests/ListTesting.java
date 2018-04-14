package MethodTests;

abstract class ListTesting {
    static <T> void assertEquals(String comment, T expected, T actual) {
        assert expected.equals(actual) :
                "\u001B[31m" + comment + " Expected value: " + "\u001B[32m" + expected + "\u001B[31m"
                        + ", retrieved: " + "\u001B[30m" + actual + "\u001B[31m";
    }
}
