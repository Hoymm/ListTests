import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public enum ListType{
    arrayList {
        @Override
        List createNewObj(){
            return new ArrayList();
        }

        @Override
        public String toString() {
            return "ArrayList";
        }
    },

    linkedList {
        @Override
        List createNewObj(){
            return new LinkedList();
        }

        @Override
        public String toString() {
            return "LinkedList";
        }
    };

    abstract List createNewObj();
}