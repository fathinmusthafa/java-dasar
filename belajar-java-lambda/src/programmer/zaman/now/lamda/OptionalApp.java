package programmer.zaman.now.lamda;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Eko");
        sayHello(null); // ERROR NullPointerExc, handle use Optional
    }

    public static void sayHello(String name){

        // optional biasa
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUppper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUppper.ifPresent(value -> System.out.println("HELLO " + value));

        // optional lebih singkat
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO" + value));

        // mengambil data di optional
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

        // if check null
//        if(name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO " + upperName);
//        }
    }
}
