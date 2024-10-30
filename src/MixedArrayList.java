import java.util.ArrayList;
import java.util.Objects;

public class MixedArrayList {
    public static ArrayList<Object> CreatedMixedArrayList() {
        ArrayList<Object> MixedArrayList = new ArrayList<>();
        MixedArrayList.add("apple");
        MixedArrayList.add(42);
        MixedArrayList.add(true);
        MixedArrayList.add(3.14);
        MixedArrayList.add('A');
        return MixedArrayList;
    }

    public static void printArrayListWithTypes(ArrayList<Object> list) {
        for(Object o : list) {
            System.out.println(o + " data type is " + o.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        printArrayListWithTypes(CreatedMixedArrayList());
    }
}
