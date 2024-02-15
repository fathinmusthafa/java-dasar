package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        //menambah data
        collection.add("Fathin");
        collection.add("Musthafa");
        collection.add("Habiburrahman");

        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection) {
            System.out.println(value);
        }

        //hapus data
        collection.remove("Fathin");
        collection.removeAll(List.of("Programmer","Zaman"));

        for (var value : collection) {
            System.out.println(value);
        }

        //mengecek data
        System.out.println(
                collection.contains("Musthafa")
        );

        System.out.println(
                collection.containsAll(List.of("Habiburrahman", "Now"))
        );

    }
}
