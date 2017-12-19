package repository;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import objects.Person;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.*;

/**
 * Created by Света on 05.12.2017.
 */
public class PersonRepositoryTest {
    private static Logger logger= LogManager.getLogger();

    @Test
    public void add() throws Exception {
        logger.info("It is test logger");
        PersonRepository repository=new PersonRepository();
        Person person=new Person("Anna", "Ivanova",  LocalDate.parse("2000-09-09"));
        repository.add(person);
        assertEquals(repository.getRepository()[0].toString(),person.toString());
    }


    @Test
    public void remove() throws Exception {
        PersonRepository repository=new PersonRepository();
        Person person=new Person("Anna", "Ivanova",  LocalDate.parse("2000-09-09"));
        Person person2=new Person("Daria", "Ivanova",  LocalDate.parse("2000-09-09"));
        repository.add(person);
        repository.add(person2);
        repository.remove(1);
        assertEquals(repository.getRepository()[0].toString(),person.toString());
    }

    @Test
    public void sortByFirstName() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Smith",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person1);
        testArray.add(person2);
        testArray.add(person3);
        testArray.add(person4);

        PersonRepository result = new PersonRepository();
        result.add(person4);
        result.add(person1);
        result.add(person);
        result.add(person3);
        result.add(person2);

        testArray.sortByFirstName();
        assertArrayEquals("Error",result.getRepository(),testArray.getRepository());

    }

    @Test
    public void sortByLastName() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Smith",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person1);
        testArray.add(person2);
        testArray.add(person3);
        testArray.add(person4);

        PersonRepository result = new PersonRepository();
        result.add(person2);
        result.add(person1);
        result.add(person4);
        result.add(person3);
        result.add(person);

        testArray.sortByLastName();
        assertArrayEquals("Error",result.getRepository(),testArray.getRepository());

    }



    @Test
    public void sortById() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Smith",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person3);
        testArray.add(person4);
        testArray.add(person2);
        testArray.add(person1);

        PersonRepository result = new PersonRepository();
        result.add(person);
        result.add(person1);
        result.add(person2);
        result.add(person3);
        result.add(person4);

        testArray.sortById();
        assertArrayEquals("Error",testArray.getRepository(),result.getRepository());


    }

    @Test
    public void sortByAge() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Smith",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person3);
        testArray.add(person4);
        testArray.add(person2);
        testArray.add(person1);

        PersonRepository result = new PersonRepository();
        result.add(person);
        result.add(person1);
        result.add(person2);
        result.add(person3);
        result.add(person4);

        testArray.sortByAge();
        assertArrayEquals("Error",testArray.getRepository(),result.getRepository());


    }

    @Test
    public void searchByLastName() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Polo",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person3);
        testArray.add(person4);
        testArray.add(person2);
        testArray.add(person1);

        PersonRepository result = new PersonRepository();
        result.add(person);
        result.add(person3);

        assertArrayEquals("Error",testArray.searchByLastName("Polo").getRepository(),result.getRepository());

    }

    @Test
    public void searchById() throws Exception {
        PersonRepository testArray = new PersonRepository();
        Person person = new Person("Jon","Polo",LocalDate.parse("1994-09-09"));
        Person person1 = new Person("Hik","Hock",LocalDate.parse("1996-10-09"));
        Person person2 = new Person("Pavel","Davidov",LocalDate.parse("1999-09-23"));
        Person person3 = new Person("Max","Polo",LocalDate.parse("2000-11-11"));
        Person person4 = new Person("Daria","Mafia",LocalDate.parse("2004-09-09"));

        testArray.add(person);
        testArray.add(person3);
        testArray.add(person4);
        testArray.add(person2);
        testArray.add(person1);


        PersonRepository result = (PersonRepository) testArray.searchById(1);
        Assert.assertEquals(result.getRepository()[0],testArray.getRepository()[0]);

    }

}