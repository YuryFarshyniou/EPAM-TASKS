package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Customer> customers;

    {
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


}
