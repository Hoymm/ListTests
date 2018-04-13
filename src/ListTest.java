import MethodTests.*;
public class ListTest {

    public static void testSize(ListType listType) {
        TestSize.fiveToFive(listType.createNewObj());
        TestSize.zeroToZero(listType.createNewObj());
    }
    public static void testIsEmpty(ListType listType) {
        TestIsEmpty.testEmptyArray(listType.createNewObj());
        TestIsEmpty.testNonEmptyArray(listType.createNewObj());
    }

    public static void testContains(ListType listType) {
        TestContains.checkIfEmptyListCointainsNull(listType.createNewObj());
        TestContains.checkIfICanFindAStringInObjectsArray(listType.createNewObj());
        TestContains.checkIfICannotFindAStringInObjectsArray(listType.createNewObj());
    }

    public static void testIterator(ListType listType) {
        TestIterator.testIfEmptyHasNoNextItem(listType.createNewObj());
        TestIterator.testIteratorWithSomeElements(listType.createNewObj());
    }

    public static void testToArray(ListType listType) {
        TestToArray.equalsEmptyArray(listType.createNewObj());
        TestToArray.equalsExampleArrays(listType.createNewObj());
    }
}
