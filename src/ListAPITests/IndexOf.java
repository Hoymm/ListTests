package ListAPITests;

import java.util.List;

public class IndexOf extends ListTesting{
    private final static String METHOD_NAME = ".indexOf()";

    public static void ListObj1Obj2Obj3_indexOfObj2_shouldReturn1(List list) {
        // given
        Object obj1 = "Obj1";
        Object obj2 = "Obj2";
        Object obj3 = "Obj2";
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        int expectedIndexOfObj2IsValue1 = 1;
        // when
        int actualIndexOfObj2 = list.indexOf(obj2);
        // then
        assertEquals(list.getClass() + METHOD_NAME, expectedIndexOfObj2IsValue1, actualIndexOfObj2);
    }
}
