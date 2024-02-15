package programmer.zaman.now.lamda.app;

import programmer.zaman.now.lamda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceNonStaticApp {
    public static void main(String[] args) {

        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));

        // Method Reference Parameter
        // before reference
        // Function<String,String> functionUpper = value -> value.toLowerCase();

        // after reference
        // syarat, method tidak boleh punya parameter
        Function<String,String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Eko"));

    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    // method reference object
    public void run2() {
        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp();

        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
