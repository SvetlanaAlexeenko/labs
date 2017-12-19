package repository;

import searching.Checker;

import java.util.Iterator;

/**
 * interface with general methods
 * Created by Света on 10.12.2017.
 */
public interface Repository1<T extends Comparable<T>> extends Iterable<T>{
    Object[] getRepository();
    int getSize();
    void add(T t);
    void remove(int i);
    Repository1<T> search(Object o, Repository1<T> repository, Checker<T> checker);

    @Override
    Iterator<T> iterator();
}
