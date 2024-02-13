package set;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("After removing the values");
        list.remove(1);
        System.out.println(list);
        list.removeAll(list);
        System.out.println();
        list.add(30);
        list.add(40);
        boolean valueIsPresent = list.contains(30);
        System.out.println(valueIsPresent);
    }
}
