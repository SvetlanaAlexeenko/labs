package sorting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Света on 05.12.2017.
 */
public class SortConfigurator {
    private static SortConfigurator ourInstance=new SortConfigurator();
    public PersonSorter getSorter()throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream = new FileInputStream("labFirst\\src\\main\\resources\\config.properties");
        properties.load(inputStream);

        String property=properties.getProperty("sorter");
        if(property.equals("buble")){
            return new BublePersonSorter();
        }
        else if(property.equals("cocktail")){
            return new CocktailPersonSorter();
        } else {
            return new BublePersonSorter();
        }
    }


    public static SortConfigurator getInstance(){
        return ourInstance;
    }
    private SortConfigurator(){}

}
