import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public enum ListType{
    arrayList {
        @Override
        List generateNewList(){
            return new ArrayList();
        }
    },
    linkedList {
        @Override
        List generateNewList(){
            return new LinkedList();
        }
    };
    abstract List generateNewList();
}