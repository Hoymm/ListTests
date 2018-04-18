package ListAPITests;


import java.util.Arrays;
import java.util.List;

public class LastIndexOf extends ListTesting{
    private final static String METHOD_NAME = ".lastIndexOf()";

    public static void List424457_lastIndexOf4_shouldGiveValue4(List list) {
        // given
        list.addAll(Arrays.asList(4,2,4,4,5,7));
        // when
        int lastIndexOf4ShouldBe3 = list.lastIndexOf(4);
        // then
        assertEquals(list.getClass() + METHOD_NAME, 3, lastIndexOf4ShouldBe3);
    }
    
    public static void lastIndexOfElementThatIsNotOnTheList_shouldResultInNegativeOne(List list){
        // given
        // when
        int lastIndexOfEmptyList = list.lastIndexOf(4);
        // then
        assertEquals(list.getClass() + METHOD_NAME, -1, lastIndexOfEmptyList);
    }
}