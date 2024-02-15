package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        //banyak yang deprecated
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        // mengganti tahun
        calendar.set(Calendar.YEAR, 2020);

        //menambah atau mengurang
        calendar.add(Calendar.YEAR, -10);

        //mengganti bulan
        calendar.set(Calendar.MONTH, Calendar.JANUARY);

        //untuk bacanya
        Date result = calendar.getTime();
        System.out.println(result);

    }
}
