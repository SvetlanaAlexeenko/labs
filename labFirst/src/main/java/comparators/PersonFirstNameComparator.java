package comparators;

import java.util.Comparator;
import person.Person;

/**
 * Created by Света on 04.12.2017.
 */
public class PersonFirstNameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());}
}