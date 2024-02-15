package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {

        List.of("Fathin", "Musthafa", "Habiburrahman").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                .forEach(length -> System.out.println(length));

    }

    @Test
    void testFlatMap() {

        List.of("Fathin", "Musthafa", "Habiburrahman").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .forEach(length -> System.out.println(length));

    }
}
