package repository;

import comparators.PersonAgeComparator;
import comparators.PersonFirstNameComparator;
import comparators.PersonIdComparator;
import comparators.PersonLastNameComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.Person;
import searching.Checker;
import searching.IdPersonChecker;
import searching.NamePersonChecker;
import sorting.SortConfigurator;
import sorting.Sorter;

import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Света on 11.12.2017.
 */
public class PersonRepository extends AbstractRepository<Person> {
    private static Logger logger = LogManager.getLogger();

    /**
     * sort by first name
     */
    public void sortByFirstName() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(super.getRepository(), new PersonFirstNameComparator());
            logger.info("Sort by first name");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    /**
     * sort by last name
     */
    public void sortByLastName() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(super.getRepository(), new PersonLastNameComparator());
            logger.info("Sort by last name");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    /**
     * sort by id
     */
    public void sortById() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(super.getRepository(), new PersonIdComparator());
            logger.info("Sort by id");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    /**
     * sort by age
     */
    public void sortByAge() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(super.getRepository(), new PersonAgeComparator());
            logger.info("Sort by age");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    public Repository1<Person> search(Object o,Repository1<Person> repository, Checker<Person> checker){
        Repository1<Person> result=new PersonRepository();
        for (int i=0; i<repository.getRepository().length; i++){
            if(checker.check(o, (Person) repository.getRepository()[i])){
                result.add((Person) repository.getRepository()[i]);
            }
        } return result;
    }

    /**
     * search by last name
     * @param name
     * @return object of class PersonRepository
     */
    public Repository1<Person> searchByLastName(String name){
        logger.info("Search by first name");
        return search(name, this, new NamePersonChecker());
    }

    /**
     * search by id
     * @param id
     * @return object of class PersonRepository
     */
    public Repository1<Person> searchById(int id){
        logger.info("Search by id");
        return search(id, this, new IdPersonChecker());
    }


}
