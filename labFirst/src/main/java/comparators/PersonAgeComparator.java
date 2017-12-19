package comparators;

import objects.Person;

import java.util.Comparator;

/**
 * Created by Света on 04.12.2017.
 */
public class PersonAgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        return p2.getAge()-p1.getAge();
    }
}
