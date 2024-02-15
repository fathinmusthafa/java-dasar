package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        //string ke number
        String contoh = "10000";

        // non primitif
        Integer contohInteger = Integer.valueOf(contoh);

        // primitif
        int  contohInt = Integer.valueOf(contoh);

        System.out.println(contohInteger);


    }
}
