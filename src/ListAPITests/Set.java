package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class Set extends ListTesting{
    private final static String METHOD_NAME = ".set()";

    public static void list123_setElement1ToVal0_shouldResultInList103(List actualList103) {
        // given
        actualList103.addAll(Arrays.asList(1,2,3));
        List expectedList103 = Arrays.asList(1,0,3);
        // when
        actualList103.set(1, 0);
        // then
        assertEquals(actualList103.getClass() + METHOD_NAME, expectedList103, actualList103);
    }
}