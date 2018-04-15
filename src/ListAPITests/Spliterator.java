package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class Spliterator extends ListTesting{
    private final static String METHOD_NAME = ".spliterator()";

    public static void test(List list) {
        // given
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        java.util.Spliterator spliterator = list.spliterator();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.characteristics());
        // when
        // then
//        assertEquals(list.getClass() + METHOD_NAME, , );
    }
}