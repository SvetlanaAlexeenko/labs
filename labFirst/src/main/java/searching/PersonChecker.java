package searching;

import objects.Person;

/**
 * Created by Света on 05.12.2017.
 */
public abstract class PersonChecker implements Checker<Person>{
    public abstract boolean check(Object o, Person person);
}
