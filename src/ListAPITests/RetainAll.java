package ListAPITests;


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
        assertListsEqual(actualList.getClass() + METHOD_NAME, expectedList35, actualList);
    }

    public static void emptyList_retainAllSomething_shouldReturnFalse(List actualList) {
        // given
        // when
        boolean retainResult = actualList.retainAll(Arrays.asList(3,5));
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, false, retainResult);
    }

    public static void list1234_retain12_shouldReturnTrue(List actualList) {
        // given
        actualList.addAll(Arrays.asList(1,2,3,4));
        // when
        boolean retainResult = actualList.retainAll(Arrays.asList(1,2));
        // then
        assertEquals(actualList.getClass() + METHOD_NAME, true, retainResult);
    }
}
