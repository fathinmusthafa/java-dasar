package programmer.zaman.now.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Fathin");
        map.put("last", "Habiburrahman");
        map.put("middle", "Musthafa");

        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key);
        }

    }
}
