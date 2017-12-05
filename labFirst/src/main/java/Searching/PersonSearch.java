package Searching;

import person.Person;

/**
 * Created by Света on 05.12.2017.
 */
public class PersonSearch {

    /**
     * standart search
     * @param person
     * @param p
     * @return
     */
    public int simpleSearch(Person person, Person[] p){
        int result=-1;
        for (int i=0;i<p.length;i++){
            if(person.getId()==p[i].getId()){
                result=i;
            }
        } return result;
    }


    /**
     * binary search
     * @param person
     * @param p
     * @return
     */
    public int binarySearch(Person person,Person[] p){
        int result=-1;
        int mid;
        int left=0;
        int right=p.length;
        if(p!=null){
            while (left<right){
                mid=(left+right)/2;
                if(person.getId()==p[mid].getId()){
                    result=mid;
                    break;
                }else {
                    if(person.getId()<p[mid].getId()){
                        right=mid;
                    }else {
                        left=mid+1;
                    }
                }
            }
        } return result;
    }
}
