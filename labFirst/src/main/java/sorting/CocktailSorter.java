package sorting;


import java.util.Comparator;

/**
 * Created by Света on 17.12.2017.
 */
public class CocktailSorter implements Sorter {

    /**
     * cocktail cort
     * @param o
     * @param c
     * @return
     */
    public Object[] sort(Object[] o, Comparator c){
        int left=0;
        int right=o.length-1;
        do{
            for(int i=left;i<right;i++){
                if(c.compare(o[i],o[i+1])>0){
                    Object k=o[i];
                    o[i]=o[i+1];
                    o[i+1]=k;
                }
            } right--;
            for(int i=right;i>left;i--){
                if(c.compare(o[i],o[i-1])<0){
                    Object k=o[i];
                    o[i]=o[i-1];
                    o[i-1]=k;
                }
            }left++;
        }while (left<right);
        return o;
    }
}
