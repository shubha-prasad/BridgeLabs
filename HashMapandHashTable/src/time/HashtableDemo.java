package time;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<Integer,String>();
        table.put(1,"a");
        table.put(2,"b");
        table.put(3,"c");
        table.put(4,"d");
        System.out.println("Iterating HashMap");
        for(Map.Entry t : table.entrySet())
        {
            System.out.println(t.getKey() + "" + t.getValue());
        }
    }
}
