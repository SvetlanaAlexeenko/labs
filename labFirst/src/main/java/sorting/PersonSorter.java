package sorting;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 05.12.2017.
 */
public interface PersonSorter {
    Person[] sort(Person[] p, Comparator<Person> c);
}
