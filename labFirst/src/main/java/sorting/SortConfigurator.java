package sorting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Света on 05.12.2017.
 */
public class SortConfigurator {
    private static SortConfigurator instance=new SortConfigurator();
    public Sorter getSorter()throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream = new FileInputStream("E:\\Netcracker\\java\\lab\\labFirst\\src\\main\\resources\\config.properties");
        properties.load(inputStream);

        String property=properties.getProperty("sorter");
        if(property.equals("buble")){
            return new BubleSorter();
        }
        else if(property.equals("cocktail")){
            return new CocktailSorter();
        } else {
            return new BubleSorter();
        }
    }


    public static SortConfigurator getInstance(){
        return instance;
    }
    private SortConfigurator(){}

}
