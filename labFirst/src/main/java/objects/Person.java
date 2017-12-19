package objects;
import org.joda.time.LocalDate;
import org.joda.time.Years;

/**
 * Created by Света on 28.11.2017.
 */
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private static int count=0;
    private int id;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = count;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * age of person
     * @return age
     */
    public int getAge(){
        return Years.yearsBetween(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public int compareTo(Person p) {
        return (this.count - p.count) ;
    }
}
