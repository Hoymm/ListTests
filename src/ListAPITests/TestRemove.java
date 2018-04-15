package ListAPITests;
import java.util.List;

public class TestRemove extends ListTesting{
        private final static String METHOD_NAME = ".remove()";

        public static void list789_removeElement1_getElement1ShouldGive9(List list789Remove1){
            // given
            list789Remove1.add(7);
            list789Remove1.add(8);
            list789Remove1.add(9);
            // when
            list789Remove1.remove(1);
            // then
            assertEquals(METHOD_NAME + list789Remove1.getClass(), list789Remove1.get(1), 9);
        }
}
