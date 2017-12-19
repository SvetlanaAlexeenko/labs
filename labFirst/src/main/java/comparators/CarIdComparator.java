package comparators;


import objects.Car;

import java.util.Comparator;

/**
 * Created by Света on 17.12.2017.
 */
public class CarIdComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return (c1.getId()-c2.getId());
    }
}
