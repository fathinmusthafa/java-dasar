package programmer.zaman.now.lamda.app;

import programmer.zaman.now.lamda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

        // jika hanya memanggil sebuah method, static, dan parameter hanya satu,
        // parameter di method juga sama typenya dengan parameter predicate,
        // return sama, jumlah parameter sama
        // -> gunkan mehod reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));

    }
}
