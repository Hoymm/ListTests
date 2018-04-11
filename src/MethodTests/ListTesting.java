package MethodTests;

abstract class ListTesting {
    static <T> void assertTrue(String info, T expected, T actual) {
        assert expected == actual : info + " should return " + expected + ", but returns " + actual;
    }
}
