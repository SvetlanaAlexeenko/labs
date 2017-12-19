package searching;

import objects.Car;

/**
 * Created by Света on 17.12.2017.
 */
public class ModelCarChecker extends CarChecker {
    public boolean check(Object o, Car car){
        return o.equals(car.getModel());
    }
}
