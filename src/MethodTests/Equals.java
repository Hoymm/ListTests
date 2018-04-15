package MethodTests;


import java.util.Arrays;
import java.util.List;

public class Equals extends ListTesting{
    private final static String METHOD_NAME = ".equals()";

    public static void list123_equalsList123(List list123) {
        // given
        list123.addAll(Arrays.asList(1,2,3));
        List exectedList123 = Arrays.asList(1,2,3);
        // when
        // then
        assertListsEquals(list123.getClass() + METHOD_NAME, exectedList123, list123);
    }

    public static void list123_differentThan1234(List list123) {
        // given
        list123.addAll(Arrays.asList(1,2,3));
        List exectedList123 = Arrays.asList(1,2,3,4);
        // when
        // then
        assertListsNotEqual(list123.getClass() + METHOD_NAME, exectedList123, list123);
    }

    public static void list123_differentThan132(List list123) {
        // given
        list123.addAll(Arrays.asList(1,2,3));
        List exectedList123 = Arrays.asList(1,3,2);
        // when
        // then
        assertListsNotEqual(list123.getClass() + METHOD_NAME, exectedList123, list123);
    }
}