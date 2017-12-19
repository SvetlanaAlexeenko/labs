package comparators;

import person.Car;

import java.util.Comparator;

/**
 * Created by Света on 17.12.2017.
 */
public class CarModelComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2){
        return c1.getModel().compareTo(c2.getModel());
    }
}
