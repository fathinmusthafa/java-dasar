package programmer.zaman.now.collection;

import java.util.*;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> one = Collections.singleton("Satu");
        Set<String> empty = Collections.emptySet();

        Set<String> mutable = new HashSet<>();
        mutable.add("Fathin");
        mutable.add("Musthafa");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> elements = Set.of("Fathin", "Musthafa");

    }
}
