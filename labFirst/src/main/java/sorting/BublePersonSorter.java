package sorting;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 05.12.2017.
 */
public class BublePersonSorter implements PersonSorter {

    /**
     * buble sort, standart
     * @param p
     * @param c
     * @return
     */
    public Person[] sort(Person[] p, Comparator<Person> c){
        for (int i=p.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(c.compare(p[j],p[j+1])>0){
                    Person k=p[j];
                    p[j]=p[j+1];
                    p[j+1]=k;
                }
            }
        }
        return p;
    }
}
