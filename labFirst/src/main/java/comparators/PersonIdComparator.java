package comparators;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 04.12.2017.
 */
public class PersonIdComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return (p1.getId()-p2.getId());
    }
}
