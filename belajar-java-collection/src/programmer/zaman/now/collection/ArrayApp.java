package programmer.zaman.now.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> names = List.of("Fathin", "Musthafa", "Habiburrahman");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
