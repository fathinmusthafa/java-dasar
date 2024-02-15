package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void testMock() {

        List<String> list = Mockito.mock(List.class);

        // menambahkan behaviour
        Mockito.when(list.get(0)).thenReturn("Eko");

        System.out.println(list.get(0));

        Mockito.verify(list, Mockito.times(1)).get(0);

    }
}
