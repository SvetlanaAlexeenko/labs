package repository;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.*;

/**
 * Created by Света on 05.12.2017.
 */
public class RepositoryTest {

    @Test
    public void addPerson() throws Exception {
        Repository repository=new Repository();
        Person person=new Person("Anna", "Ivanova", 1, LocalDate.parse("2000-09-09"));
        repository.addPerson(person);
        Assert.assertEquals(repository.getPeople()[0].toString(),person.toString());
    }


    @Test
    public void remove() throws Exception {
        Repository repository=new Repository();
        Person person=new Person("Anna", "Ivanova", 1, LocalDate.parse("2000-09-09"));
        Person person2=new Person("Daria", "Ivanova", 2, LocalDate.parse("2000-09-09"));
        repository.addPerson(person);
        repository.addPerson(person2);
        repository.remove(2);
        Assert.assertEquals(repository.getPeople()[0].toString(),person.toString());
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