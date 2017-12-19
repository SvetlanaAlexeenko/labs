package repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * implementation of general methods
 * Created by Света on 10.12.2017.
 */
public abstract class AbstractRepository <T extends Comparable<T>> implements Repository1<T>{
    private static Logger logger = LogManager.getLogger();
    private int size;
    private Object [] repository;

    /**
     * add new element to repository
     * @param elem class T
     */
    public void add(T elem){
        logger.info("Add new element");
        if (size == 0) {
            setRepository(new Object[1]);
            this.repository[0] = elem;
            setSize(getSize() + 1);
        } else {
            Object[] newR = new Object[getSize() + 1];
            System.arraycopy(this.repository, 0, newR, 0, getSize());
            newR[getSize()] = elem;
            setRepository(newR);
            setSize(getSize() + 1);
        }
    }

    /**
     * remove element from repository
     * @param i
     */
    public void remove(int i){
        logger.info("remove one element");
        Object[] newR = new Object[getSize()-1];
        System.arraycopy(getRepository(), 0, newR, 0, i);
        System.arraycopy(getRepository(), i+1, newR, i, getSize()-i-1);
        setRepository(newR);
        setSize(getSize()-1);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Object[] getRepository() {
        return this.repository;
    }

    public void setRepository(Object[] repository) {
        this.repository = repository;
    }

    @Override
    public Iterator<T> iterator() {
        return new OurIterator();
    }

    class OurIterator implements Iterator<T> {
        int i = 0;

        public boolean hasNext() {
            if (i < getSize()) {
                return true;
            } else {
                return false;
            }
        }


        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T)getRepository()[i++];
        }
    }
}
