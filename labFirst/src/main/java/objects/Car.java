package objects;

import org.joda.time.LocalDate;

/**
 * Created by Света on 12.12.2017.
 */
public class Car implements Comparable<Car> {
    private static int count=0;
    private LocalDate dateOfRelease;
    private String model;
    private int id;

    public Car(String model, LocalDate dateOfRelease) {
        count++;
        this.setModel(model);
        this.id=count;
        this.setDateOfRelease(dateOfRelease);
    }


    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(LocalDate dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Car c){return (this.count - c.count) ;}

    @Override
    public String toString() {
        return "Car{" +
                "dateOfRelease=" + dateOfRelease +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }
}
