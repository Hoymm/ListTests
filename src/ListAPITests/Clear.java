package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class Clear extends ListTesting{
    private final static String METHOD_NAME = ".clear()";

    public static void addElementsToList_clearList_compareToEmptyListShouldReturnTrue(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4,5));
        List emptyList = Arrays.asList();
        // when
        list.clear();
        // then
        assertListsEquals(list.getClass() + METHOD_NAME, emptyList, list);
    }

    public static void clearEmptyList_shouldResultInEmptyList(List list) {
        // given
        List emptyList = Arrays.asList();
        // when
        list.clear();
        // then
        assertListsEquals(list.getClass() + METHOD_NAME, emptyList, list);
    }
}
