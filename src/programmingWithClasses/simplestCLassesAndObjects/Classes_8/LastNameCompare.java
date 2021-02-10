package programmingWithClasses.simplestCLassesAndObjects.Classes_8;

import java.util.Comparator;

public class LastNameCompare implements Comparator<Customer> {
    public int compare (Customer one,Customer two){
        return one.getLastName().compareTo(two.getLastName());
    }
}
