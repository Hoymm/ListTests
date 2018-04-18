package ListAPITests;

import java.util.Arrays;
import java.util.List;

public class Get extends ListTesting{
    private final static String METHOD_NAME = ".get()";

    public static void get2_onList789_shouldResultInValue30(List <Integer> list) {
        // given
        list.addAll(Arrays.asList(7,8,9));
        // when
        int shouldBe9 = list.get(2);
        // then
        assertEquals(list.getClass() + METHOD_NAME, 9, shouldBe9);
    }

    public static void getNegativeIndex_onList789_shouldResult(List <Integer> list) {
        // given
        boolean isOutOfBoundsExpectionThrown = false;
        // when
        try {
            list.get(-1);
        }catch (IndexOutOfBoundsException e){
            isOutOfBoundsExpectionThrown = true;
        }
        // then
        assert isOutOfBoundsExpectionThrown : "Try to get negative index should result in IndexOutOfBoundsException";
    }
}
