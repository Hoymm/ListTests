import MethodTests.*;
public class ListTest {

    public static void testSize(ListType listType) {
        System.out.println("1");
        TestSize.fiveToFive(listType.createNewObj());
        TestSize.zeroToZero(listType.createNewObj());
    }

    public static void testIsEmpty(ListType listType) {
        System.out.println("2");
        TestIsEmpty.testEmptyArray(listType.createNewObj());
        TestIsEmpty.testNonEmptyArray(listType.createNewObj());
    }

    public static void testContains(ListType listType) {
        System.out.println("3");
        TestContains.checkIfEmptyListCointainsNull(listType.createNewObj());
        TestContains.checkIfICanFindAStringInObjectsArray(listType.createNewObj());
        TestContains.checkIfICannotFindAStringInObjectsArray(listType.createNewObj());
    }

    public static void testIterator(ListType listType) {
        System.out.println("4");
        TestIterator.testIfEmptyHasNoNextItem(listType.createNewObj());
        TestIterator.testIteratorWithSomeElements(listType.createNewObj());
    }

    public static void testToArray(ListType listType) {
        System.out.println("5");
        TestToArray.equalsEmptyArray(listType.createNewObj());
        TestToArray.equalsExampleArrays(listType.createNewObj());
    }
}
