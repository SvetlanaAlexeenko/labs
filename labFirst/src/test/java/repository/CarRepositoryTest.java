package repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;
import objects.Car;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Света on 17.12.2017.
 */
public class CarRepositoryTest {
    private static Logger logger= LogManager.getLogger();

    @Test
    public void add() throws Exception {
        logger.info("It is test logger");
        CarRepository repository=new CarRepository();
        Car car=new Car("mers",  LocalDate.parse("1980-09-09"));
        repository.add(car);
        assertEquals(repository.getRepository()[0].toString(),car.toString());
    }

    @Test
    public void remove() throws Exception {
        CarRepository repository=new CarRepository();
        Car car=new Car("mers",  LocalDate.parse("2000-09-09"));
        Car car2=new Car("bmw",  LocalDate.parse("2000-09-09"));
        repository.add(car);
        repository.add(car2);
        repository.remove(1);
        assertEquals(repository.getRepository()[0].toString(),car.toString());
    }

    @Test
    public void sortByFirstName() throws Exception {
        CarRepository testArray = new CarRepository();
        Car car = new Car("mers",LocalDate.parse("1994-09-09"));
        Car car2 = new Car("bmw",LocalDate.parse("1994-09-09"));
        Car car3 = new Car("ford",LocalDate.parse("1994-09-09"));

        testArray.add(car);
        testArray.add(car2);
        testArray.add(car3);

        CarRepository result = new CarRepository();
        result.add(car2);
        result.add(car3);
        result.add(car);

        testArray.sortByModel();
        assertArrayEquals("Error",result.getRepository(),testArray.getRepository());

    }

    @Test
    public void sortById() throws Exception {
        CarRepository testArray = new CarRepository();
        Car car = new Car("mers",LocalDate.parse("1994-09-09"));
        Car car2 = new Car("bmw",LocalDate.parse("1994-09-09"));
        Car car3 = new Car("ford",LocalDate.parse("1994-09-09"));

        testArray.add(car);
        testArray.add(car3);
        testArray.add(car2);

        CarRepository result = new CarRepository();
        result.add(car);
        result.add(car2);
        result.add(car3);

        testArray.sortById();
        assertArrayEquals("Error",result.getRepository(),testArray.getRepository());

    }

    @Test
    public void searchByModel() throws Exception {
        CarRepository testArray = new CarRepository();
        Car car = new Car("mers",LocalDate.parse("1994-09-09"));
        Car car2 = new Car("bmw",LocalDate.parse("1994-09-09"));
        Car car3 = new Car("mers",LocalDate.parse("1994-09-09"));

        testArray.add(car);
        testArray.add(car3);
        testArray.add(car2);

        CarRepository result = new CarRepository();
        result.add(car);
        result.add(car3);

        assertArrayEquals("Error",testArray.searchByModel("mers").getRepository(),result.getRepository());

    }
    @Test
    public void searchById() throws Exception {
        CarRepository testArray = new CarRepository();
        Car car = new Car("ford",LocalDate.parse("1994-09-09"));
        Car car2 = new Car("bmw",LocalDate.parse("1994-09-09"));
        Car car3 = new Car("mers",LocalDate.parse("1994-09-09"));

        testArray.add(car);
        testArray.add(car3);
        testArray.add(car2);


        CarRepository result = (CarRepository) testArray.searchById(1);
        Assert.assertEquals(result.getRepository()[0],testArray.getRepository()[0]);

    }
}
