package programmer.zaman.now.lamda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Fathin Musthafa");

    }
}
