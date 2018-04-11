package MethodTests;

abstract class ListTesting {
    static <T> void assertTrue(String comment, T expected, T actual) {
        assert expected.equals(actual) : comment + "Test should return " + expected + ", but returns " + actual;
    }
}
