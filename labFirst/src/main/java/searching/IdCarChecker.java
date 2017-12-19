package searching;

import person.Car;

/**
 * Created by Света on 17.12.2017.
 */
public class IdCarChecker extends CarChecker{
    public boolean check(Object o, Car car){
        return o.equals(car.getId());
    }
}
