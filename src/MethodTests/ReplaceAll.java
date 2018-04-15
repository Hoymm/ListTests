package MethodTests;

import java.util.Arrays;
import java.util.List;

public class ReplaceAll extends ListTesting {
    private final static String METHOD_NAME = ".replaceAll()";

    public static void list1null23_replaceAllNullBy0_shouldResultInList1023(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1, null, 3, 4));
        List expectedList35 = Arrays.asList(1,0,3,4);
        // when
        actualList.replaceAll(o -> o == null ? 0 : o);
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }
}
