package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

//Problem Mutable
public class MutableListApp {
    public static void main(String[] args) {

        Person person = new Person("Fathin");
        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()
             ) {
            System.out.println(hobby);
        }
    }

    //misal ada method lain yg menambahkan hobby, maka akan masuk ke object person yg memanggil method tsb
    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
