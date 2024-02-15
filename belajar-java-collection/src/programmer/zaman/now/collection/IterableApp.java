package programmer.zaman.now.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Fathin", "Musthafa", "Habiburrahman");

        for (var name : names) {
            System.out.println(name);
        }

        // Iterator
        // implementasi for-each
        Iterator<String> iterator = names.iterator();

        // loop
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
