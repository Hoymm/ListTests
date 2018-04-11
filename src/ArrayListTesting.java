class ArrayListTesting {
    protected static <T> void assertTrue(String testedMethod, T expected, T actual) {
        assert expected == actual : testedMethod + " should return " + expected + ", but returns " + actual;
    }
}
