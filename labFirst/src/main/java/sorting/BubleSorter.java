package sorting;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 05.12.2017.
 */
public class BubleSorter implements Sorter {

    /**
     * buble sort, standart
     * @param o
     * @param c
     * @return
     */
    public Object[] sort(Object[] o, Comparator c){
        for (int i=o.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(c.compare(o[j],o[j+1])>0){
                    Object k=o[j];
                    o[j]=o[j+1];
                    o[j+1]=k;
                }
            }
        }
        return o;
    }
}