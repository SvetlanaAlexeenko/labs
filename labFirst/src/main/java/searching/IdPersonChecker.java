package searching;

import person.Person;

/**
 * Created by Света on 05.12.2017.
 */
public class IdPersonChecker implements PersonChecker{
    public boolean check(Object o, Person person){
        return o.equals(person.getId());
    }
}
