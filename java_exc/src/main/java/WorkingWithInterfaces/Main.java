package WorkingWithInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> family = new ArrayList<>();

        family.add(new Person("Dana", "Wyatt", 63));
        family.add(new Person("Zachary", "Westley", 31));
        family.add(new Person("Elisha", "Aslan", 14));
        family.add(new Person("Ian", "Austin", 16));
        family.add(new Person("Zephaniah", "Hughes", 9));
        family.add(new Person("Ezra", "Aiden", 17));

        System.out.println("No sorting");
        for (Person person : family) {
            System.out.println(person);
        }

        Collections.sort(family);

        System.out.println("\nAfter sorting by last name:");
        for (Person person : family) {
            System.out.println(person);
        }

    }

}