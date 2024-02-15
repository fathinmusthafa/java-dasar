package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // Set<String> names = new HashSet<>(); //data tidak berurut
        Set<String> names = new LinkedHashSet<>(); //data urut

        names.add("Fathin");
        names.add("Musthafa");
        names.add("Habiburrahman");
        names.add("Fathin");
        names.add("Musthafa");
        names.add("Habiburrahman");

        for (var name : names
             ) {
            System.out.println(name);
        }
    }
}
