package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class Contains extends ListTesting {
    private final static String METHOD_NAME = ".contains()";

    public static void emptyList_containsNull_shouldResulFalse(List list) {
        // given
        // when
        boolean emptyListContainsNullShouldBeFalse = list.contains(null);
        // then
        assertEquals(list.getClass() + METHOD_NAME, false, emptyListContainsNullShouldBeFalse);
    }

    public static void listOfObjectsIncludingStringheheh_listContainsheheh_shouldReturnTrue(List list){
        // given
        list.addAll(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean actual = list.contains("heheh");
        // then
        assertEquals(list.getClass() + METHOD_NAME, true, actual);
    }

    public static void listOfObjects_listContainsStringNIE_MA_shouldResultFalse(List list){
        // given
        list.addAll(Arrays.asList(1,2,3, new Object(), "heheh"));
        // when
        boolean listContainsNIE_MA_shouldReturnFalse = list.contains("NIE MA");
        // then
        assertEquals(list.getClass() + METHOD_NAME, false, listContainsNIE_MA_shouldReturnFalse);
    }
}
