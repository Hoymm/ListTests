package MethodTests;


import java.util.Arrays;
import java.util.List;

public class Remove extends ListTesting{
    private final static String METHOD_NAME = ".remove()";

    public static void fromList123_removeIndex1_shouldResultInList13(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,2,3));
        List expectedList13 = Arrays.asList(1,3);
        // when
        actualList.remove(1);
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, expectedList13, actualList);
    }

    public static void list_removeByObject_shouldResultInListWithoutThatObject(List actualList) {
        // given
        Object obj1 = "Obiekt1", obj2 = "Obiekt2";
        actualList.add(obj1);
        actualList.add(obj2);
        List expectedListWithOneObject = Arrays.asList(obj2);
        // when
        actualList.remove(obj1);
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, expectedListWithOneObject, actualList);
    }
}
