package person;

import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Света on 05.12.2017.
 */
public class PersonTest {
    Person person1=new Person("Anna", "Ivanova", 1, LocalDate.parse("2000-09-09"));
    @Test
    public void getAge() {
        assertEquals(17, person1.getAge());
    }

}