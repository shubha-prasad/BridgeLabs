package time;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, " A");
        map.put(2, " B");
        map.put(3, " C");
        System.out.println("Iterating HashMap");
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
