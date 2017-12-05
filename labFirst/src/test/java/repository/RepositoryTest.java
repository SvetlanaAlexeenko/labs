package repository;

import org.joda.time.LocalDate;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.*;

/**
 * Created by Света on 05.12.2017.
 */
public class RepositoryTest {
    Repository repository=new Repository();
    Person person=new Person("Anna", "Ivanova", 1, LocalDate.parse("2000-09-09"));
    @Test
    public void addPerson() throws Exception {

            }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void sortByFirstName() throws Exception {
    }

    @Test
    public void sortByLastName() throws Exception {
    }

    @Test
    public void sortById() throws Exception {
    }

    @Test
    public void sortByAge() throws Exception {
    }

    @Test
    public void searchByFirstName() throws Exception {
    }

    @Test
    public void searchById() throws Exception {
    }

}