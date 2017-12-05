package sorting;

import person.Person;

import java.util.Comparator;

/**
 * Created by Света on 05.12.2017.
 */
public class PersonSorts {
    /**
     * buble sort, standart
     * @param p
     * @param c
     * @return
     */
    public Person[] bubleSort(Person[] p, Comparator<Person> c){
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

    /**
     * cocktail cort
     * @param p
     * @param c
     * @return
     */
    public Person[] cocktailSort(Person[] p, Comparator<Person> c){
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
