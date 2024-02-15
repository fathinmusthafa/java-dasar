package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String,String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("name", "Fathin");

        Map<String,String> mutable = new HashMap<>();
        mutable.put("name", "Fathin");
        Map<String,String> immutable = Collections.unmodifiableMap(mutable);

        Map<String,String> map = Map.of(
                "first", "Fathin",
                "middle", "Musthafa",
                "last", "Habiburrahman"
        );

        //map.put("a", "A"); //ERROR

    }
}
