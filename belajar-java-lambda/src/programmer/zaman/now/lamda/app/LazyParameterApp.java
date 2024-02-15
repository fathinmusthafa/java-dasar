package programmer.zaman.now.lamda.app;

import java.util.function.Supplier;

public class LazyParameterApp {
    // bukan lazy, method getName sbg parameter ttp dipanggil meskipun score tidak terpenuhi
//    public static void main(String[] args) {
//        testScore(60, getName());
//    }
//
//    public static void testScore(int score, String name) {
//        if(score > 80) {
//            System.out.println("Selamat " + name + ", Anda Lulus");
//        } else {
//            System.out.println("Coba lagi tahun depan");
//        }
//    }

    // lazy, method getName sbg parameter tidak dipanggil ketika score tdk terpenuhi
    public static void main(String[] args) {
        testScore(60, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if(score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    // by default java, semua method pasti dipanggil
    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Eko";
    }
}
