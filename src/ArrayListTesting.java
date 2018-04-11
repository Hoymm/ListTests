class ArrayListTesting {
    protected static <T> String message (String method, T expected, T actual){
        return method + " should return " + expected + ", but returns " + actual;
    }
}
