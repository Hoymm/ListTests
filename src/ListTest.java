import MethodTests.*;
class ListTest {
    static void run(ListType listType){
        testSize(listType);
        testIsEmpty(listType);
        testContains(listType);
    }

    private static void testSize(ListType listType) {
        Size.fiveToFive(listType.generateNewList());
        Size.zeroToZero(listType.generateNewList());
    }

    private static void testIsEmpty(ListType listType) {
        IsEmpty.testEmptyArray(listType.generateNewList());
        IsEmpty.testNonEmptyArray(listType.generateNewList());
    }

    private static void testContains(ListType listType) {
        Contains.checkIfEmptyListCointainsNull(listType.generateNewList());
        Contains.checkIfICanFindAStringInObjectsArray(listType.generateNewList());
        Contains.checkIfICannotFindAStringInObjectsArray(listType.generateNewList());
    }
}
