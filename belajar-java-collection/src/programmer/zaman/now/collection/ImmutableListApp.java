package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Fathin");
        mutable.add("Musthafa");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Fathin", "Musthafa");
        elements.add("Agus");

    }
}
