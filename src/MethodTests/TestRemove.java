package MethodTests;

import java.util.Arrays;
import java.util.List;

public class TestRemove extends ListTesting{
        private final static String METHOD_NAME = ".remove()";

        public static void listyOf1234Remove2_shouldResultInList134(List list789Remove1){
            // given
            list789Remove1 = Arrays.asList(7,8,9);
            List list79 = Arrays.asList(7,9);
            // when
            list789Remove1.remove(1);
            // then
            for (int i = 0; i < list789Remove1.size(); ++i){
                assertEquals(list789Remove1.getClass() + METHOD_NAME, list789Remove1.get(i), list79.get(i));
            }
        }
}
