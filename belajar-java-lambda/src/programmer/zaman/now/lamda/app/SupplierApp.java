package programmer.zaman.now.lamda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Fathin Musthafa Habiburrahman";

        System.out.println(supplier.get());

    }
}
