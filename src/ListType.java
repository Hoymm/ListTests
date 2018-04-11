import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public enum ListType{
    arrayList {
        @Override
        List createNewObj(){
            return new ArrayList();
        }
    },

    linkedList {
        @Override
        List createNewObj(){
            return new LinkedList();
        }
    };

    abstract List createNewObj();
}