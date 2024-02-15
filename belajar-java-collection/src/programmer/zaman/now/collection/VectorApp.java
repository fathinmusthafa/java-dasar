package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Fathin");
        list.add("Musthafa");
        list.add("Habiburrahman");

        for ( var value:
             list) {
            System.out.println(value);
        }

    }
}
