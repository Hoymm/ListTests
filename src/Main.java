
public class Main {
    public static void main(String[] args) {
        ListTest.runTestsForListImplementation(ListType.arrayList);
        ListTest.runTestsForListImplementation(ListType.linkedList);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
