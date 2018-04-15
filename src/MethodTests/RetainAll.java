package MethodTests;


import java.util.Arrays;
import java.util.List;

public class RetainAll extends ListTesting{
    private final static String METHOD_NAME = ".retainAll()";

    public static void list12345_retainAll35_shouldResultInList35(List actualList) {
        // given

        actualList.addAll(Arrays.asList(1,2,3,4,5));
        List expectedList35 = Arrays.asList(3,5);
        // when
        actualList.retainAll(Arrays.asList(3,5));
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }
}
