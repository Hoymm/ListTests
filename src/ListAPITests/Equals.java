package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class Equals extends ListTesting{
    private final static String METHOD_NAME = ".equals()";

    public static void list123_equalsList123_shouldReturnTrue(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3));
        List exectedList123 = Arrays.asList(1,2,3);
        // when
        // then
        assertListsEqual(list.getClass() + METHOD_NAME, exectedList123, list);
    }

    public static void list123_equalsList1234_shouldReturnFalse(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3));
        List exectedList123 = Arrays.asList(1,2,3,4);
        // when
        // then
        assertListsDifferent(list.getClass() + METHOD_NAME, exectedList123, list);
    }

    public static void emptyList_equalsEmptyList_shouldReturnTrue(List list) {
        // given
        List emptyList = Arrays.asList();
        // when
        // then
        assertListsEqual(list.getClass() + METHOD_NAME, emptyList, list);
    }
}