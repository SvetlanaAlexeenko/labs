package Searching;

import person.Person;

/**
 * Created by Света on 05.12.2017.
 */
public class NamePersonChecker implements PersonChecker{
    public boolean check(Object o, Person person){
        return person.getLastName().equals(o);
    }
}
