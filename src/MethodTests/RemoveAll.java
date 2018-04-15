package MethodTests;


import java.util.Arrays;
import java.util.List;

public class RemoveAll extends ListTesting{
    private final static String METHOD_NAME = ".removeAll()";

    public static void list12345_removeAll124_shouldResultInList35(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,2,3,4,5));
        List expectedList35 = Arrays.asList(3,5);
        // when
        actualList.removeAll(Arrays.asList(1,2,4));
        // then
        assertListsEquals(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }

    public static void list11112_removeAll1_shouldResultInList2(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,1,1,1,2));
        List expectedList2 = Arrays.asList(2);
        // when
        actualList.removeAll(Arrays.asList(1));
        // then
        assertListsEquals(actualList.getClass() + METHOD_NAME, expectedList2, actualList);
    }
}