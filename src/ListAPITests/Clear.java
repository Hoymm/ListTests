package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class Clear extends ListTesting{
    private final static String METHOD_NAME = ".clear()";

    public static void addElementsToList_clearList_compareToEmptyListShouldReturnTrue(List listAfterClearInvoked) {
        // given
        listAfterClearInvoked.addAll(Arrays.asList(1,2,3,4,5));
        List emptyList = Arrays.asList();
        // when
        listAfterClearInvoked.clear();
        // then
        assertListsEquals(listAfterClearInvoked.getClass() + METHOD_NAME, emptyList, listAfterClearInvoked);
    }
}
