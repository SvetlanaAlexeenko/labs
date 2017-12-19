package searching;

import person.Car;

/**
 * Created by Света on 17.12.2017.
 */
public abstract class CarChecker implements Checker<Car> {
    public abstract boolean check(Object o, Car car);
}
