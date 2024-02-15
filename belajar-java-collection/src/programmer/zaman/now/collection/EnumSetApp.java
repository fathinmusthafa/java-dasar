package programmer.zaman.now.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {

        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class); //semua
        EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE); //satu per satu

        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
