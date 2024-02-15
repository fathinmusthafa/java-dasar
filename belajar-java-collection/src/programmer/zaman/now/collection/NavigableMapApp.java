package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("Joko", "Joko");
        map.put("Budi", "Budi");

        for ( var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("kurang dari Eko asc : " + map.lowerKey("Eko")); // kurang dari Eko asc
        System.out.println("lebih dari Eko asc : " + map.higherKey("Eko")); // lebih dari Eko asc
        System.out.println("kurang dari sama dengan asc : " + map.floorKey("Nugraha")); // kurang dari sama dengan asc
        System.out.println("lebih dari sama dengan asc : " + map.ceilingKey("Nugraha")); //lebih dari sama dengan asc

        // merubah descending
        NavigableMap<String,String> descMap = map.descendingMap();
        for ( var key : descMap.keySet()) {
            System.out.println(key);
        }

        // immutable
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(descMap);

        // immutable.put("a", "A"); ERROR
    }
}
