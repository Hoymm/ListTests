package MethodTests;


import java.util.Arrays;
import java.util.List;

public class AddAll extends ListTesting{
    private final static String METHOD_NAME = ".addAll()";

    public static void list0_addAll123_shouldResultInList0123(List expectList0123) {
        // given
        expectList0123.add(0);
        List actualList0123 = Arrays.asList(0,1,2,3);
        // when
        expectList0123.addAll(Arrays.asList(1,2,3));
        // then
        assertListsEquals(expectList0123.getClass() + METHOD_NAME, expectList0123, actualList0123);
    }

    public static void list04_addAll123FromIndex1_shouldResultInList01234(List expectedList01234) {
        // given
        expectedList01234.add(0);
        expectedList01234.add(4);
        List actualList023 = Arrays.asList(0,1,2,3,4);
        // when
        expectedList01234.addAll(1, Arrays.asList(1,2,3));
        // then
        assertListsEquals(expectedList01234.getClass() + METHOD_NAME, expectedList01234, actualList023);
    }
}