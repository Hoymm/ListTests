package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class Add extends ListTesting{
    private final static String METHOD_NAME = ".add()";

    public static void list123_AddElement1ToVal0_shouldResultInList1023(List actualList1023) {
        // given
        actualList1023.addAll(Arrays.asList(1,2,3));
        List expectedList1023 = Arrays.asList(1,0,2,3);
        // when
        actualList1023.add(1, 0);
        // then
        assertEquals(actualList1023.getClass() + METHOD_NAME, expectedList1023, actualList1023);
    }
}