package MethodTests;


import java.util.Arrays;
import java.util.List;

public class RemoveAll extends ListTesting{
    private final static String METHOD_NAME = ".removeAll()";

    public static void listRemoveAll_shouldResultInEmptyList(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,2,3,4,5));
        List expectedList35 = Arrays.asList(3,5);
        // when
        actualList.removeAll(Arrays.asList(1,2,4));
        // then
        assertListsEquals(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }
}