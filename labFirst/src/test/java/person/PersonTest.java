package person;

import objects.Person;
import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Света on 05.12.2017.
 */
public class PersonTest {
    Person person1=new Person("Anna", "Ivanova",  LocalDate.parse("2000-09-09"));
    @Test
    public void getAge() {
        assertEquals(17, person1.getAge());
    }

}