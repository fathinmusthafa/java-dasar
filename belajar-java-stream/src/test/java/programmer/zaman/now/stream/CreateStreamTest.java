package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        // stream kosong , tnp data
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        // stream dengan data
        // wajib memasukkan data
        Stream<String> oneStream = Stream.of("Eko");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        // stream data kosong atau tidak (optional)
        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStraem = Stream.of("Fathin", "Musthafa", "Habiburrahman");
        arrayStraem.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{"Fathin", "Musthafa", "Habiburrahman"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromCollection() {

        Collection<String> collection = List.of("Fathin", "Musthafa", "Habiburrahman");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println); // tidak bisa digunakan ulang, harus buat stream baru

        // stream baru
        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);

    }

    @Test
    void testCreateInfiniteStream() {

        // value langsung
        Stream<String> stream = Stream.generate(() -> "PZN");
        // stream.forEach(System.out::println);

        // value bisa dirubah
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);

    }
}
