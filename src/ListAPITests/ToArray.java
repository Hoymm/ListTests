package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class ToArray extends ListTesting {
    private final static String METHOD_NAME = ".toArray()";

    public static void equalsEmptyArray(List list) {
        // given
        // when
        boolean listProperlyConvertedToArray = Arrays.equals(list.toArray(), new Object []{});
        // then
        assertEquals(list.getClass() + METHOD_NAME, true, listProperlyConvertedToArray);
    }

    public static void list1234_toArray_properlyConvertedListToArray(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4));
        // when
        boolean list1234ConvertedToArrayEqualsArray1234 = Arrays.equals(new Object[]{1,2,3,4}, list.toArray());
        // then
        assertEquals(list.getClass() + METHOD_NAME, true, list1234ConvertedToArrayEqualsArray1234);
    }
}
