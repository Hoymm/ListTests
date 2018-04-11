import MethodTests.*;

class ArrayListTests {
    static void run(){
        testSize();
        testIsEmpty();
        testContains();
    }

    private static void testSize() {
        ArrayList_Size.fiveToFive();
        ArrayList_Size.zeroToZero();
    }

    private static void testIsEmpty() {
        ArrayList_IsEmpty.testEmptyArray();
        ArrayList_IsEmpty.testNonEmptyArray();
    }

    private static void testContains() {
        ArrayList_Contains.checkIfEmptyListCointainsNull();
        ArrayList_Contains.checkIfICanFindAStringInObjectsArray();
        ArrayList_Contains.checkIfICannotFindAStringInObjectsArray();
    }
}
