package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("Fathin");
        strings.add("Musthafa");

        strings.set(0, "Budi");

        strings.remove(1);

        for (var value : strings) {
            System.out.println(value);
        }

    }
}
