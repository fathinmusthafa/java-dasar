package programmerzamannow.reflection;

import org.junit.jupiter.api.Test;
import programmerzamannow.reflection.data.Person;

import java.io.File;
import java.lang.reflect.Field;

public class FieldsTest {

    @Test
    void testGetFields() {

        Class< Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person = new Person("Fathin", "Musthafa");

        String result = (String) firstName.get(person);
        System.out.println(result);

        Person person2 = new Person("Budi", "Sujoko");

        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person = new Person("Fathin", "Musthafa");

        firstName.set(person, "Joko"); // person.setFirstName("Joko")
        System.out.println(person.getFirstName());

        Person person2 = new Person("Budi", "Sujoko");

        firstName.set(person2, "Agus"); // person2.setFirstName("Agus")
        System.out.println(person2.getFirstName());
    }
}
