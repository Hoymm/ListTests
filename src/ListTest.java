import MethodTests.*;
class ListTest {
    static void run(ListType listType){
        long time = System.currentTimeMillis();

        new Thread(() -> testSize(listType)).start();
        new Thread(() -> testIsEmpty(listType)).start();
        new Thread(() -> testContains(listType)).start();
        new Thread(() -> testIterator(listType)).start();
        new Thread(() -> testToArray(listType)).start();

        System.out.println(listType + ", testing time: " + (System.currentTimeMillis() - time) + "ms.");
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

    private static void testToArray(ListType listType) {
        TestToArray.equalsEmptyArray(listType.createNewObj());
        TestToArray.equalsExampleArrays(listType.createNewObj());
    }
}
