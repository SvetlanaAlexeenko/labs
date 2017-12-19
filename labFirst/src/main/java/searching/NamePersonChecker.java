package searching;

import objects.Person;

/**
 * Created by Света on 05.12.2017.
 */
public class NamePersonChecker extends PersonChecker{
    public boolean check(Object o, Person person){
        return person.getLastName().equals(o);
    }
}
