package repository;
import searching.IdPersonChecker;
import searching.NamePersonChecker;
import searching.PersonChecker;
import sorting.Sorter;
import sorting.SortConfigurator;
import comparators.PersonAgeComparator;
import comparators.PersonFirstNameComparator;
import comparators.PersonIdComparator;
import comparators.PersonLastNameComparator;
import person.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;


/**
 * Created by Света on 28.11.2017.
 */
public class Repository{
    private static Logger logger = LogManager.getLogger();
    private int size;
    private Person[] people;

    public Repository() {
        logger.info("Create repository");
        setSize(0);
    }

    /**
     * add one person to repository
     * @param person
     */
    public void addPerson(Person person) {
        logger.info("Add new Person");
        if (size == 0) {
            setPeople(new Person[1]);
            this.people[0] = person;
            this.size++;
        } else {
                    Person[] newP = new Person[getSize() + 1];
                    System.arraycopy(this.people, 0, newP, 0, getSize());
                    newP[getSize()] = person;
                    setPeople(newP);
                    setSize(getSize() + 1);
                }


    }

    /**
     * remove one person from repository
     * @param id  index of element in repository
     */
    public void remove(int id) {
        logger.info("Remove Person");
        int i;
        for (i = 0; i < getSize(); i++) {
            if (getPeople()[i].getId() == id)
                break;
        }
        for (int j = i; j < getSize() - 1; j++) {
            people[j] = people[j + 1];
        }
        Person[] newP = new Person[getSize() - 1];
        System.arraycopy(this.people, 0, newP, 0, getSize()-1);
        setPeople(newP);
        setSize(getSize() - 1);
    }

    public void sortByFirstName() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(this.getPeople(), new PersonFirstNameComparator());
            logger.info("Sort by first name");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    public void sortByLastName() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(getPeople(), new PersonLastNameComparator());
            logger.info("Sort by last name");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    public void sortById() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(getPeople(), new PersonIdComparator());
            logger.info("Sort by id");
        } catch (IOException e) {
            logger.catching(e);
        }
    }

    public void sortByAge() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(getPeople(), new PersonAgeComparator());
            logger.info("Sort by age");
        } catch (IOException e) {
            logger.catching(e);
        }
    }


    /**
     * search
     * @param checker
     * @param o
     * @param repository
     * @return repository of all eligible elements
     */
    private Repository search(PersonChecker checker,Object o,Repository repository){
        Repository result=new Repository();
        for (int i=0;i<repository.getPeople().length;i++){
            if(checker.check(o,repository.getPeople()[i])){
                result.addPerson(repository.getPeople()[i]);
            }
        } return result;
    }

    public Repository searchByFirstName(String name){
        logger.info("Search by first name");
        return search(new NamePersonChecker(),name,this);
    }

    public Repository searchById(int id){
        logger.info("Search by id");
        return search(new IdPersonChecker(),id,this);
    }

    public int getSize() {
        return size;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}
