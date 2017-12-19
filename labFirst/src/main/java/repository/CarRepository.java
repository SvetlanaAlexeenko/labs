package repository;

import comparators.CarIdComparator;
import comparators.CarModelComparator;
import objects.Car;
import searching.*;
import sorting.SortConfigurator;
import sorting.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;


/**
 * Created by Света on 11.12.2017.
 */
public class CarRepository extends AbstractRepository<Car> {
    private static Logger logger = LogManager.getLogger();

    /**
     * sort by model
     */
    public void sortByModel() {
        try {
            Sorter sorter = SortConfigurator.getInstance().getSorter();
            sorter.sort(super.getRepository(), new CarModelComparator());
            logger.info("Sort by model");
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
            sorter.sort(super.getRepository(), new CarIdComparator());
            logger.info("Sort by id");
        } catch (IOException e) {
            logger.catching(e);
        }
    }


    public Repository1<Car> search(Object o, Repository1<Car> repository, Checker<Car> checker){
        Repository1<Car> result=new CarRepository();
        for (int i=0; i<repository.getRepository().length; i++){
            if(checker.check(o, (Car) repository.getRepository()[i])){
                result.add((Car) repository.getRepository()[i]);
            }
        } return result;
    }

    /**
     * search by model
     * @param model
     * @return object of class CarRepository
     */
    public Repository1<Car> searchByModel(String model){
        logger.info("Search by first name");
        return search(model, this, new ModelCarChecker());
    }

    /**
     * search by id
     * @param id
     * @return object of class CarRepository
     */
    public Repository1<Car> searchById(int id){
        logger.info("Search by id");
        return search(id, this, new IdCarChecker());
    }
}
