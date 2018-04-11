import MethodTests.*;
class ListTest {
    static void run(ListType listType){
        testSize(listType);
        testIsEmpty(listType);
        testContains(listType);
        testIterator(listType);
    }

    private static void testSize(ListType listType) {
        TestSize.fiveToFive(listType.createNewObj());
        TestSize.zeroToZero(listType.createNewObj());
    }

    private static void testIsEmpty(ListType listType) {
        TestIsEmpty.testEmptyArray(listType.createNewObj());
        TestIsEmpty.testNonEmptyArray(listType.createNewObj());
    }

    private static void testContains(ListType listType) {
        TestContains.checkIfEmptyListCointainsNull(listType.createNewObj());
        TestContains.checkIfICanFindAStringInObjectsArray(listType.createNewObj());
        TestContains.checkIfICannotFindAStringInObjectsArray(listType.createNewObj());
    }

    private static void testIterator(ListType listType) {
        TestIterator.testIfEmptyHasNoNextItem(listType.createNewObj());
        TestIterator.testIteratorWithSomeElements(listType.createNewObj());
    }
}
