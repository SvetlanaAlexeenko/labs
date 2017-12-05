package Sorting;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 05.12.2017.
 */
public class CocktailPersonSorter implements PersonSorter {

    /**
     * cocktail cort
     * @param p
     * @param c
     * @return
     */
    public Person[] sort(Person[] p, Comparator<Person> c){
        int left=0;
        int right=p.length-1;
        do{
            for(int i=left;i<right;i++){
                if(c.compare(p[i],p[i+1])>0){
                    Person k=p[i];
                    p[i]=p[i+1];
                    p[i+1]=k;
                }
            } right--;
            for(int i=right;i>left;i--){
                if(c.compare(p[i],p[i-1])<0){
                    Person k=p[i];
                    p[i]=p[i-1];
                    p[i-1]=k;
                }
            }left++;
        }while (left<right);
        return p;
    }
}
