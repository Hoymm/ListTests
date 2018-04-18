package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class RemoveAll extends ListTesting{
    private final static String METHOD_NAME = ".removeAll()";

    public static void list12345_removeAllList124_shouldResultInList35(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,2,3,4,5));
        List expectedList35 = Arrays.asList(3,5);
        // when
        actualList.removeAll(Arrays.asList(1,2,4));
        // then
        assertListsEqual(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }

    public static void list11112_removeAllList1_shouldResultInList2(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,1,1,1,2));
        List expectedList2 = Arrays.asList(2);
        // when
        actualList.removeAll(Arrays.asList(1));
        // then
        assertListsEqual(actualList.getClass() + METHOD_NAME, expectedList2, actualList);
    }

    public static void list_tryToRemoveSomeObjectsThatListContainsAndSomeThatDoesnt_shouldReturnTrueBecauseListWasModified(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3));
        // when
        boolean listWasModified = list.removeAll(Arrays.asList(1,2,5));
        // then
        assert listWasModified : "List changed so .removeAll should return true instead of false.";
    }

    public static void list_tryToRemoveObjectsThatListDoesNotContain_shouldReturnFalseBecauseListWasNotModified(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3));
        List objListToRemove = Arrays.asList(5, 6, 7, 8);
        // when
        boolean listWasModified = list.removeAll(objListToRemove);
        // then
        assert !listWasModified : "List" + list + ".removeAll(" + objListToRemove +") should return false, because list was not modified.";
    }

    public static void tryToRemoveAllObjectsFromList_shouldReturnTrueBecauseListWasModifiedAndListShouldBeEmpty(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3));
        List objListToRemove = Arrays.asList(1,2,3);
        // when
        boolean listWasModified = list.removeAll(objListToRemove);
        // then
        assert listWasModified : "List" + list + ".removeAll(" + objListToRemove +") should return false, because list was not modified.";
        assert list.isEmpty() : "List should be empty";
    }
}