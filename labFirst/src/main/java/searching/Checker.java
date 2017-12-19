package searching;

/**
 * Created by Света on 17.12.2017.
 */
public interface Checker<T extends Comparable<T>> {
    boolean check(Object o,T t);
}
