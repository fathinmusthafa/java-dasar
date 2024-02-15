package programmer.zaman.now.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000");

        //menjumlah
        BigInteger c = a.add(b);

        //kurang
        BigInteger d = a.subtract(b);

        System.out.println(c);
        System.out.println(b);

    }
}
