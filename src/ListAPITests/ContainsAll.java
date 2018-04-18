package ListAPITests;
import java.util.Arrays;
import java.util.List;

public class ContainsAll {
    public static void list123_containsList13_shouldReturnTrue(List list123) {
        // given
        list123.add(1);
        list123.add(2);
        list123.add(3);
        List list13 = Arrays.asList(1, 3);
        // when
        boolean list13IsSubsetOfList123 = list123.containsAll(list13);
        // then
        assert  list13IsSubsetOfList123 : "List " + list123 + ".contains(" + list13 + ") should return true";
    }

    public static void list123_containsList12387_shouldReturnFalse(List list123) {
        // given
        list123.addAll(Arrays.asList(1,2,3));
        List list12387 = Arrays.asList(1, 2, 3, 8, 7);
        // when
        boolean list123ContainsList12387 = list123.containsAll(list12387);
        // then
        assert  !list123ContainsList12387 : "List " + list123 + ".contains(" + list12387 + ") should return false";
    }
}
