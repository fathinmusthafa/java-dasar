package programmer.zaman.now.lamda.app;

import programmer.zaman.now.lamda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Fathin";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        SimpleAction simpleAction2 = () -> {
//            return "Joko";
//        };
//
//        System.out.println(simpleAction2.action());

        // cara membuat lamda
        // 1 . paramaeter dengan type
        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        // 2. parameter tanpa type
        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        // 3. Jika return satu baris, tidak perlu blok ( {} )
        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        SimpleAction simpleAction4 = (value) -> "Hello " + value;

        // jika parameter cuma satu, bisa tidak menggunakan kurung
        SimpleAction simpleAction5 = value -> "Hello " + value;


    }
}
