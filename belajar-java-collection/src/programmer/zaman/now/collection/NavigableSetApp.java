package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Fathin", "Musthafa", "Habiburrahman", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> musthafa = names.headSet("Musthafa", true); //if true, element include

        for (var name : musthafa) {
            System.out.println(name);
        }

        // immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);

    }
}
