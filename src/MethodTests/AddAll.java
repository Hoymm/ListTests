package MethodTests;


import java.util.Arrays;
import java.util.List;

import static MethodTests.ListTesting.assertEquals;

public class AddAll{
    private final static String METHOD_NAME = ".addAll()";

    public static void list0_addAll123_shouldResultInList0123(List list0123) {
        // given
        list0123.add(0);
        // when
        list0123.addAll(Arrays.asList(1,2,3));
        // then
        for (int i = 0; i < list0123.size(); ++i)
            assertEquals(list0123.getClass() + METHOD_NAME, i, list0123.get(i));
    }

    public static void list04_addAll123FromIndex1_shouldResultInList01234(List expectedList01234) {
        // given
        expectedList01234.add(0);
        expectedList01234.add(4);
        List actualList023 = Arrays.asList(0,1,2,3,4);
        // when
        expectedList01234.addAll(1, Arrays.asList(1,2,3));
        // then
        for (int i = 0; i < actualList023.size(); ++i)
            assertEquals(expectedList01234.getClass() + METHOD_NAME
                    , expectedList01234.get(i), actualList023.get(i));
    }
}