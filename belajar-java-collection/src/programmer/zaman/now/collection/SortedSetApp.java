package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); //ascending
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); //descending

        people.add(new Person("Fathin"));
        people.add(new Person("Musthafa"));
        people.add(new Person("Habiburrahman"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        //immutable
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);


    }
}
